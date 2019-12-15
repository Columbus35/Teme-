import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/Rectangle.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homwork/Rectangle.text");
        Scanner s = new Scanner(fis);
        String a = s.nextLine();
        String[] line = a.split(" ");
        String number = line[0];
        String number2 = line[1];
        Double widht = Double.parseDouble(number);
        Double height = Double.parseDouble(number2);
        double area = widht * height;
        double perimeter = 2 * (widht + height);
        System.out.println("Area is = " + area);
        System.out.println("Perimeter is = " + perimeter);
    }
}
