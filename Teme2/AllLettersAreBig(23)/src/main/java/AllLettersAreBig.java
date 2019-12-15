import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class AllLettersAreBig {

    public static void main(String[] args) throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/Letter.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homwork/Letter.text");
        Scanner s = new Scanner(fis);
        String a = s.nextLine();
        char[] line = a.toCharArray();
        int b = line.length;
        char[] letter = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j',
                'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        char[] bigLetter = {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J',
                'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M'};
        char space = (' ');
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] other = {',', '.', '!', '?', '/', ':'};

        for (int i = 0; i < b; i++) {
            if(line[i] == space){
                System.out.print(line[i]);
            }
            for(int x = 0; x < 10; x++){
                if(line[i] == numbers[x]){
                    System.out.print(line[i]);
                }
            }

            for(int y = 0; y < 6; y++){
                if(line[i] == other[y]){
                    System.out.print(line[i]);
                }
            }

            for (int j = 0; j < 26; j++) {
                if (line[i] == letter[j]) {
                    System.out.print(bigLetter[j]);
                }

            }
        }
    }
}




