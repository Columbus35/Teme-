import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class SameDigit {

    public static void main(String[] args) throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/Same Digit.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homwork/Same Digit.text");
        Scanner s = new Scanner(fis);
        String a = s.nextLine();
        String[] line = a.split(" ");
        String in1 = line[0];
        String in2 = line[1];
        int number1 = Integer.parseInt(in1);
        int number2 = Integer.parseInt(in2);
        char b = in1.charAt(0);
        char c = in1.charAt(1);
        char d = in2.charAt(0);
        char e = in2.charAt(1);
        boolean output = false;
        boolean digit = false;
        if (number1 > 25 && number1 < 75 && number2 > 25 && number2 < 75) {
            output = true;
        } else System.out.println("The number is out of the list.");

        if (b == c || b == d || b == e || c == d || c == e || d == e) {
            digit = true;
        }
        if (output && digit) {
            System.out.println("The 2 numbers have one or more same digits");
        }
        if (output && !digit) {
            System.out.println("The 2 numbers have none same digits");
        }
    }
}
