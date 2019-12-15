import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/Reverse.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homwork/Reverse.text");
        Scanner s = new Scanner(fis);
        String a = s.nextLine();
        String reverse = "";
        for (int i = a.length() - 1; i >= 0; --i) {
            reverse += a.charAt(i);
            if(i == 0){
                System.out.println("Original String :");
                System.out.println(a);
                System.out.println("Reverse String :");
                System.out.println(reverse);}
        }


    }
}
