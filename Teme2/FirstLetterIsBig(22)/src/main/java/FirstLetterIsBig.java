import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FirstLetterIsBig {

    public static void main(String[] args) throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/Big Letter.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homwork/Big Letter.text");
        Scanner s = new Scanner(fis);
        String a = s.nextLine();
        int b = a.length();
        char[] in = a.toCharArray();
        char[] letter = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j',
                'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        char[] bigLetter = {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J',
                'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M'};
        char space = (' ');

        for (int i = 0; i < 26; i++) {
            if (in[0] == letter[i]) {
                System.out.print(bigLetter[i]);
            }
        }
        for (int j = 1; j < b - 1; j++) {
            if (in[j] == space) {
                System.out.print(in[j]);
                int y = ++j;
                for (int x = 0; x < 26; x++) {
                    if (in[y] == letter[x]) {
                        System.out.print(bigLetter[x]);
                    }


                }

            } else System.out.print(in[j]);
        }
    }
}












