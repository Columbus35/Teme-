import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BinaryNumber {

    public static void main(String[] args) throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/Binary.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
       FileInputStream fis = new FileInputStream("Homwork/Binary.text");
        Scanner s = new Scanner(fis);
        String a = s.nextLine();
        int b = Integer.parseInt(a);
        String binary = Integer.toBinaryString(b);
        System.out.println("Decimal number " + a +" = " + binary + " Binary number");
    }
}
