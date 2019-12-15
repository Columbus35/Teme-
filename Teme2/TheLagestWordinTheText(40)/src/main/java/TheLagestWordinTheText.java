import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class TheLagestWordinTheText {

    public static void main(String[] args) throws IOException {
        largestWord();

    }

    public static String einscannen() throws IOException {
        File folder1 = new File("Homework");
        File file1 = new File("Homework/Word.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homework/Word.text");
        Scanner s = new Scanner(fis);
        String text = "";
        while (s.hasNext()) {
            text += s.nextLine() + "\n" + " ";
        }
        return text;
    }

    public static void largestWord() throws IOException {
        String[] line = einscannen().split(" ");

        for (int i = 0; i < line.length; i++) {
            boolean lenght = false;
            boolean lenght2 = true;
            for (int j = 0; j < line.length; j++) {
                char[] firstWord = line[i].toCharArray();
                char[] secondWord = line[j].toCharArray();
                if (firstWord.length > secondWord.length) {
                    lenght = true;
                }
                if (firstWord.length < secondWord.length){
                    lenght2 = false;
                }
            }
            if (lenght && lenght2) {
                System.out.println("The longest word in the text is: " + line[i]);
            }
        }
    }

}






