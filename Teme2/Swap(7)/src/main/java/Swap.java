import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/Swap.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homwork/Swap.text");
        Scanner s = new Scanner(fis);
        String a = s.nextLine();
        String[] line = a.split(" ");
        String number = line[0];
        String number2 = line[1];
        int b = Integer.parseInt(number);
        int c = Integer.parseInt(number2);
        b = b + c;
        c = b - c;
        b = b - c;
     System.out.println("Number a = " + b);
     System.out.println("Number b = " + c);

    }
}
