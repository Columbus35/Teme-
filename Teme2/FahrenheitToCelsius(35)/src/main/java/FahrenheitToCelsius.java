import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) throws IOException {

        convert();
    }

    public static int einscannen() throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/Fahrenheit.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homwork/Fahrenheit.text");
        Scanner s = new Scanner(fis);
        int numbers = Integer.parseInt(s.nextLine());
        return numbers;
    }

    public static void convert() throws IOException {
        double fahrenheit = einscannen();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");


    }

}
