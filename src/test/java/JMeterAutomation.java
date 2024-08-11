import org.apache.jmeter.control.LoopController;
import org.apache.jmeter.engine.StandardJMeterEngine;
import org.apache.jmeter.protocol.http.control.HeaderManager;
import org.apache.jmeter.protocol.http.sampler.HTTPSampler;
import org.apache.jmeter.reporters.ResultCollector;
import org.apache.jmeter.samplers.SampleSaveConfiguration;
import org.apache.jmeter.testelement.TestPlan;
import org.apache.jmeter.util.JMeterUtils;

public class JMeterAutomation {
    public static <HTTPSamplerProxy> void main(String[] args) {
        // JMeter motorunu başlat
        StandardJMeterEngine jmeter = new StandardJMeterEngine();

        // JMeter konfigürasyonunu ayarla
        JMeterUtils.loadJMeterProperties("/usr/local/jmeter/bin/jmeter.properties");
        JMeterUtils.setJMeterHome("/usr/local/jmeter");
        JMeterUtils.initLocale();

        // HTTP Sampler oluştur
        HTTPSampler httpSampler = new HTTPSampler();
        httpSampler.setDomain("example.com");
        httpSampler.setPort(80);
        httpSampler.setPath("/");
        httpSampler.setMethod("GET");
        httpSampler.setName("HTTP Request");

        // HTTP Header Manager (isteğe bağlı)
        HeaderManager headerManager = new HeaderManager();
        headerManager.add("User-Agent", "ApacheJMeter");
        httpSampler.setHeaderManager(headerManager);

        // Loop Controller oluştur
        LoopController loopController = new LoopController();
        loopController.setLoops(1);
        loopController.addTestElement(httpSampler);
        loopController.setFirst(true);
        loopController.initialize();

        // Thread Group oluştur
        ThreadGroup threadGroup = new ThreadGroup();
        threadGroup.setNumThreads(1);
        threadGroup.setRampUp(1);
        threadGroup.setSamplerController(loopController);

        // Test Plan oluştur
        TestPlan testPlan = new TestPlan("JMeter Test Plan");

        // Test Plan'a elemanları ekle
        testPlan.addThreadGroup(threadGroup);
        testPlan.addTestElement(httpSampler);

        // Log dosyasına yazma ayarları
        String logFile = "results/logfile.jtl";
        ResultCollector logger = new ResultCollector(new Summariser());
        logger.setFilename(logFile);
        SampleSaveConfiguration saveConfig = new SampleSaveConfiguration();
        saveConfig.setAsXml(true);
        logger.setSaveConfig(saveConfig);

        // Test Plan'a logger'ı ekle
        testPlan.addTestElement(logger);

        // JMeter motorunu yapılandır ve çalıştır
        jmeter.configure(testPlan);
        jmeter.run();

        System.out.println("Test tamamlandı. Sonuçlar: " + logFile);
    }
}
