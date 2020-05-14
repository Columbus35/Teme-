import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class WordSelector {

    public static void main(String[] args) throws Exception {
        fileWriter();
    }

    private static void createFile() throws Exception {
        File folder1 = new File("Homework");
        File file1 = new File("Homework/Original Folder.text");
        if (folder1.exists()) {
            System.out.println("");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("");
        } else file1.createNewFile();
        File folder2 = new File("Homework");
        File file2 = new File("Homework/Finale Folder.text");
        if (folder2.exists()) {
            System.out.println("");
        } else folder2.mkdir();
        if (file2.exists()) {
            System.out.println("");
        } else file2.createNewFile();
    }

    private static String fileReader() throws Exception {
        FileInputStream fis1 = new FileInputStream("Homework/Original Folder.text");
        Scanner c = new Scanner(fis1);
        String d = "";
        while (c.hasNext()) {
            String a =c.nextLine() + "\n";

            String b = "A";
            String[] line = a.split(" ");
            String original = line[0];
            String bigLetter = original.toUpperCase();
            boolean firstCharacter = b.equals(original);
            boolean result = original.equals(bigLetter);
            if (firstCharacter) {
                d += line[1] + "\n";
            }
            if (result && !firstCharacter) {
                d += original + "\n";
            }
        }
        return d;
    }

    private static void fileWriter() throws Exception {
        String a = fileReader();
        File file1 = new File("Homework/Finale Folder.text");
        FileWriter fw = new FileWriter(file1, true);
        fw.write(a);
        fw.close();

    }

}
