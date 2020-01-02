import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArabicNumber10 {

    private String arabicTen() throws Exception{
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("Homework/Number.text");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner s = new Scanner(fis);
        String a = s.nextLine();
        int d = Integer.parseInt(a);
        String[] romanNumber1 = {"I", "IV", "V", "IX"};
        String[] romanNumber10 = {"X", "XL", "L", "XC"};
        String convertedNumber = "";
        String b = String.valueOf(d);
        String[] c = b.split("");
        if (b.length() == 2) {
            int z = Integer.parseInt(c[0]);
            if (z == 0) {
                convertedNumber += "";
            }
            if (z > 0 && z < 4) {
                for (int i = 0; i < z; i++) {
                    convertedNumber += romanNumber10[0];
                }
            }
            if (z == 4) {
                convertedNumber += romanNumber10[1];
            }
            if (z == 5) {
                convertedNumber += romanNumber10[2];
            }
            if (z > 5 && z < 9) {
                convertedNumber += romanNumber10[2];
                for (int i = 0; i < z - 5; i++) {
                    convertedNumber += romanNumber10[0];
                }
            }
            if (z == 9) {
                convertedNumber += romanNumber10[3];
            }
            int v = Integer.parseInt(c[1]);
            if (v == 0) {
                convertedNumber += "";
            }
            if (v > 0 && v < 4) {
                for (int i = 0; i < v; i++) {
                    convertedNumber += romanNumber1[0];
                }
            }
            if (v == 4) {
                convertedNumber += romanNumber1[1];
            }
            if (v == 5) {
                convertedNumber += romanNumber1[2];
            }
            if (v > 5 && v < 9) {
                convertedNumber += romanNumber1[2];
                for (int i = 0; i < v - 5; i++) {
                    convertedNumber += romanNumber1[0];
                }
            }
            if (v == 9) {
                convertedNumber += romanNumber1[3];
            }

        }
        return convertedNumber;

    }
    public String getarabicTen() throws Exception {
        return arabicTen();

    }
}



