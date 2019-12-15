import java.io.File;
import java.io.IOException;

public class FileSize {

    public static void main(String[] args) throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/Size.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        if(file1.exists()){
            double bytes = file1.length();
            System.out.println("The file has a size from: " + bytes + " bytes");
            System.out.println("The file has a size from: " + bytes/1024 + " kilobytes");
        }

    }
}
