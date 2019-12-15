import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class AreaHexagon {

    public static void main(String[] args) throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/Hexagon.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homwork/Hexagon.text");
        Scanner s = new Scanner(fis);
        String a = s.nextLine();
        double b = Double.parseDouble(a);
        double form = 2.59807621135;
        double area = form * (b * b);
        System.out.println("The area of the Hexagon are = " + area);
    }
}
