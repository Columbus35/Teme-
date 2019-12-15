import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ascii {


    public static void main(String[] args) throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/Ascii.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homwork/Ascii.text");
        Scanner s = new Scanner(fis);
        String a = s.next();
        char[] in = a.toCharArray();
        char[] letter = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j',
                'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        String[] letterAscii = {"113", "119", "101", "114", "116", "121", "117", "105", "111", "112", "97", "115", "100", "102", "103", "104", "106",
                "107", "108", "122", "120", "99", "118", "98", "110", "109"};
        char[] bigLetter = {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J',
                'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M'};
        String[] bigLetterAscii = {"81", "87", "69", "82", "84", "89", "85", "73", "79", "80", "65", "83", "68", "70", "71", "72", "74",
                "75", "76", "90", "88", "67", "86", "66", "78", "77"};

        for(int i = 0; i < 26; i++){
            if (in[0] == bigLetter[i]){
                System.out.println("The ASCII value of " + a + " is: " + bigLetterAscii[i]);
            }
        }

        for(int j = 0; j < 26; j++){
            if (in[0] == letter[j]){
                System.out.println("The ASCII value of " + a + " is: " + letterAscii[j]);
            }
        }


    }
}
