import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Circle {

    public static void main(String[] args) throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/Circle.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homwork/Circle.text");
        Scanner s = new Scanner(fis);
        String a = s.nextLine();
        double r = Double.parseDouble(a);
        double pi = 3.141592653589;
        double perimeter = 2 * pi * r;
        double area = pi * r *r;
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

    }
}
