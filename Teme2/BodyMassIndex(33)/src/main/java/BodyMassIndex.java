import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) throws IOException {
        outPrint();

    }

    public static String einscannen() throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/BMI.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homwork/BMI.text");
        Scanner s = new Scanner(fis);
        String numbers = s.nextLine();
        return numbers;
    }

    public static double poundsToKg() throws IOException {
        double pund = 0.45359237;
        String[] line = einscannen().split(" ");
        int number = Integer.parseInt(line[0]);
        double kg = number * pund;
        return kg;
    }

    public static double incesToM() throws IOException {
        double inces = 0.0254;
        String[] line = einscannen().split(" ");
        int number = Integer.parseInt(line[1]);
        double m = number * inces;
        return m;
    }

    public static void outPrint() throws IOException{
        double m = incesToM();
        double kg = poundsToKg();
        double bmi = kg / (m * m);
        System.out.println("Body Mass Index is : " + bmi );

    }



}
