import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class DivisibleThreAndFive {

    public static void main(String[] args) throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/Divisible.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homwork/Divisible.text");
        Scanner s = new Scanner(fis);
        String a = s.nextLine();
        String[] line = a.split(" ");
        String number = line[0];
        String number2 = line[1];
        int b = Integer.parseInt(number);
        int c = Integer.parseInt(number2);
        System.out.println("Divided by " + number + ":");
        for(int i = 1; i < 101; i++){
            if(i % b == 0){
               System.out.print(i + ", ");
            }
        }
        System.out.println("");
        System.out.println("Divided by " + number2 + ":");
        for(int i = 1; i < 101; i++){
            if(i % c == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println("");
        System.out.println("Divided by " + number + " && " + number2 + ":");
        for(int i = 1; i < 101; i++){
            if(i % b == 0 && i % c == 0){
                System.out.print(i + ", ");
            }
        }

    }
}
