import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class UniqueThreeDigit {

    public static void main(String[] args) throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/Digit.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homwork/Digit.text");
        Scanner s = new Scanner(fis);
        String a = s.next();
        int number = Integer.parseInt(a);
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                for (int z = 1; z < 5; z++) {
                    if (z != j && z != i && j != i) {
                        ++number;
                        System.out.println(i + "" + j + "" + z);
                    }
                }
            }
        }
        System.out.println("From 1, 2, 3, 4, are: " + number + " three-digit numbers.");

    }
}
