import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class PenultimateWord {

    public static void main(String[] args) throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/Penultimate.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homwork/Penultimate.text");
        Scanner s = new Scanner(fis);
        String a = s.nextLine();
        String[] line = a.split(" ");
        int b = line.length;
        String c = line[b - 2];
        System.out.println("The penultimate word of the line are : " + c);


    }
}
