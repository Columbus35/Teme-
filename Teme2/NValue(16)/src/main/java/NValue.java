import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class NValue {

    public static void main(String[] args) throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/Value.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homwork/Value.text");
        Scanner s = new Scanner(fis);
        String a = s.next();
        int n = Integer.parseInt(a);
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j < i; j++){
                System.out.print(n + "");
            }
           if(i !=1 && i !=4){
            System.out.print(" + ");}
        }




    }
}
