import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class NumberOfVowels {

    public static void main(String[] args) throws IOException {
        System.out.println("This text contains " + vowels() + " vowels");

    }

    public static String einscannen() throws IOException {
        File folder1 = new File("Homework");
        File file1 = new File("Homework/Vowels.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homework/Vowels.text");
        Scanner s = new Scanner(fis);
        String text = "";
        while (s.hasNext()) {
            text += s.nextLine() + "\n" + " ";
        }
        return text;
    }

    public static int vowels() throws IOException{
        char [] line = einscannen().toCharArray();
        char[] letters = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int number = 0;
        for(int i= 0; i < line.length; i++){
            for(int j= 0; j < letters.length; j++){
                if(line[i] == letters[j]){
                    ++number;
                }
            }
        }
        return number;
    }

}
