import java.io.File;

public class DeletingExcellFile {
    public static void main(String[] args) {


        String projectPath = System.getProperty("user.dir");
        String path= projectPath + File.separator + "files" + File.separator + "example.xlsx";

        File file= new File(path);
        if (file.delete()) {
            System.out.println("Dosya başarıyla silindi: " + path);
        } else {
            System.out.println("Dosya silinemedi: " + path);
        }
    }
}
