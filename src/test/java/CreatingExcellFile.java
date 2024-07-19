import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingExcellFile {
    public static void main (String[] args){

        Workbook workbook = new XSSFWorkbook();

        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);

        String fileName = projectPath + "/files/example.xlsx";

        File file = new File(fileName);
        file.getParentFile().mkdirs();

        try (FileOutputStream fileOut = new FileOutputStream(file)) {
            workbook.write(fileOut);
            System.out.println("Boş Excel dosyası " + fileName + " olarak kaydedildi.");
        } catch (IOException e) {
            System.err.println("Dosya kaydetme işlemi sırasında hata oluştu: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();





        }
} }
