import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class DecimalNumber {

    public int binaryConvert(int bin) {
        int power = 0;
        int dec = 0;
        while (true) {

            if (bin == 0) {
                break;
            } else {
                int temp = bin % 10;
                dec += temp * Math.pow(2, power);
                bin = bin / 10;
                power++;

            }

        }

        return dec;
    }


    public static void main(String[] args) throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/Decimal.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homwork/Decimal.text");
        Scanner s = new Scanner(fis);
        String a = s.nextLine();
        int b = Integer.parseInt(a);
        DecimalNumber b2d = new DecimalNumber();
        b2d.binaryConvert(b);
        System.out.println("Binary number of = " + b + " is Decimal number of = " +  b2d.binaryConvert(b));



    }
}
