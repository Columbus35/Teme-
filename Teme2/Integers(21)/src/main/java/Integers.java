import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Integers {

    public static void main(String[] args) throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/Integers.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homwork/Integers.text");
        Scanner s = new Scanner(fis);
        String a = s.nextLine();
        String[] line = a.split(" ");
        String int1 = line[0];
        String int2 = line[1];
        String int3 = line[2];
        String revers = "";
        String revers2 = "";
        String revers3 = "";
        int i = int1.length()-1;
        int j = int2.length()-1;
        int k = int3.length()-1;
        revers += int1.charAt(i);
        revers2 += int2.charAt(j);
        revers3 += int3.charAt(k);
        int x = Integer.parseInt(revers);
        int y = Integer.parseInt(revers2);
        int z = Integer.parseInt(revers3);

        if (x >= 0 && y >= 0 && z >= 0){
           if (x == y || y == z || x == z){
               System.out.println("Two or more of this digits have the same rightmost digit");
           } else System.out.println("Two or more of this digits not have the same rightmost digit");
        } else System.out.println("The digit are negative");


    }
}
