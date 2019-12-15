import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class TwoWordsSeparated {

    public static void main(String[] args) throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/Separated.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homwork/Separated.text");
        Scanner s = new Scanner(fis);
        String a = s.nextLine();
        String separated = "Tutorial";
        char[] in = a.toCharArray();
        int b = in.length;
        char space = ' ';
        for(int i = 0; i < b; i++){
            if(in[i] == space){
                System.out.print(' ');
                System.out.print(separated);
                System.out.print(' ');
            }System.out.print(in[i]);
        }

    }
}
