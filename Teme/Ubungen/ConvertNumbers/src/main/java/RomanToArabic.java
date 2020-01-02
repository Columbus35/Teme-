import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RomanToArabic {

    private int convertRomanToArabic() throws Exception {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("Homework/Number.text");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner s = new Scanner(fis);
        String a = s.nextLine();
        char[] roman = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] arabic = {1, 5, 10, 50, 100, 500, 1000};
        char[] line = a.toCharArray();
        int number = 0;
        if (line.length == 1) {
            for (int i = 0; i < 7; i++) {
                if (line[0] == roman[i]) {
                    number += arabic[i];
                }
            }
        }
        for (int z = 0; z < line.length - 1; z++) {
            char firstNumber = line[z];
            char secondNumber = line[z + 1];
            if (firstNumber == 'I' && secondNumber == 'V') {
                number += 4;
            }
            if (firstNumber == 'I' && secondNumber == 'X') {
                number += 9;
            }
            if (firstNumber == 'X' && secondNumber == 'L') {
                number += 40;
            }
            if (firstNumber == 'X' && secondNumber == 'C') {
                number += 90;
            }
            if (firstNumber == 'C' && secondNumber == 'D') {
                number += 400;
            }
            if (firstNumber == 'C' && secondNumber == 'M') {
                number += 900;
            }
        }

        for (int i = 0; i < line.length; i++) {
            char f = line[i];
            char x;
            if (i < line.length - 1) {
                x = line[i + 1];
            } else {
                x = line[i];
            }
            boolean two = false;
            boolean end = false;
            if (f == 'I' && x == 'V' || f == 'I' && x == 'X' || f == 'X' && x == 'L' || f == 'X' && x == 'C' ||
                    f == 'C' && x == 'D' || f == 'C' && x == 'M') {
                two = true;
            }
            if (i == line.length - 2) {
                end = true;
            }
            if (two && end) {
                i = line.length - 1;
            } else {
                if (two) {
                    i = i + 2;
                }
            }
            if (two) {
                if (i < line.length - 2) {
                    for (int j = 0; j < 7; j++) {
                        if (line[i] == roman[j]) {
                            number += arabic[j];
                        }
                    }
                }
            } else {
                for (int j = 0; j < 7; j++) {
                    if (line[i] == roman[j]) {
                        number += arabic[j];
                    }
                }
            }
        }

        int b = number;
        return b;
    }

    public int getconvertRomanToArabic() throws Exception {
        return convertRomanToArabic();

    }

}
