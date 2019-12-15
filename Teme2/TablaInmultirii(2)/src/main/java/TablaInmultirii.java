import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class TablaInmultirii {

    public static void main(String[] args) throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/Inmultire.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homwork/Inmultire.text");
        Scanner s = new Scanner(fis);
        String a = s.nextLine();
        int b = Integer.parseInt(a);
        int [] inmultire = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i < inmultire.length; i++){
            int endNumber = inmultire[i] * b;
            System.out.println(b +" * "+ inmultire[i]+ " = "+ endNumber);
        }

    }
}
