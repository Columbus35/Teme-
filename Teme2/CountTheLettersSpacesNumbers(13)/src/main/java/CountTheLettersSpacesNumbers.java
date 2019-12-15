import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class CountTheLettersSpacesNumbers {

    public static void main(String[] args) throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/Count.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homwork/Count.text");
        Scanner s = new Scanner(fis);
        String a = s.nextLine();
        int returnNumber = 0;
        int returnLetter = 0;
        int returnSpase = 0;
        int returnOther = 0;
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] letter = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j',
                'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        char[] bigLetter = {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J',
                'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M'};
        char space = (' ');
        char[] other = {',', '.', '!', '?', '/', ':'};
        char[] in = a.toCharArray();
        for (int i = 0; i < a.length(); ++i) {
            if (in[i] == space) {
                ++returnSpase;
            }
        }
        for (int i = 0; i < a.length(); ++i) {
            for (int j = 0; j < 26; ++j) {
                if (in[i] == letter[j]) {
                    ++returnLetter;
                }
            }
        }

        for (int i = 0; i < a.length(); ++i) {
            for (int j = 0; j < 10; ++j) {
                if (in[i] == numbers[j]) {
                    ++returnNumber;
                }
            }
        }

        for (int i = 0; i < a.length(); ++i) {
            for (int j = 0; j < 26; ++j) {
                if (in[i] == bigLetter[j]) {
                    ++returnLetter;
                }
            }
        }

        for (int i = 0; i < a.length(); ++i) {
            for (int j = 0; j < 6; ++j) {
                if (in[i] == other[j]) {
                    ++returnOther;
                }
            }
        }
        System.out.println("The text hase: ");
        System.out.println("Letters : "+returnLetter);
        System.out.println("Numbers : "+returnNumber);
        System.out.println("Spaces : "+returnSpase);
        System.out.println("Other characters : "+returnOther);


    }
}
