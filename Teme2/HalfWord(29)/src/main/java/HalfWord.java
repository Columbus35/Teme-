import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class HalfWord {

    public static void main(String[] args) throws IOException {
        printNextLine(einscannen());

    }

    public static String einscannen() throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/Half Word.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homwork/Half Word.text");
        Scanner s = new Scanner(fis);
        String numbers = s.nextLine();
        return numbers;
    }

    public static void printNextLine(String input){
        char [] a = input.toCharArray();
        System.out.print("The half of the word is: ");
       for(int i = 0; i < a.length / 2; i++){
            System.out.print(a[i]);
        }
         /* for(int i = a.length / 2; i < a.length; i++) {
              System.out.print(a[i]);
          }*/
    }


}
