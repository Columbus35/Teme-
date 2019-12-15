import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReverseWord {


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
        int b = a.length();
        String reverse = "";
        for(int i = b - 1; i >=0; --i){
            reverse += a.charAt(i);
        }
        System.out.println("The reverse word are: " + reverse);


    }
}
