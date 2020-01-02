import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ConvertNumbers {

    public static void main(String[] args) throws Exception {
        fileCreate();
        System.out.println("Enter 1 if you want covert arabic numbers to roman numbers" +
                "           \nEnter 2 if you want covert roman numbers to arabic numbers");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a == 1) {
            writeArabicNumber();
            arabicToRoman();
        }
        if (a == 2) {
            writeRomanNumber();
            romanToArabic();
        }
    }

    private static void fileCreate() throws Exception{
        File folder1 = new File("Homework");
        File file1 = new File("Homework/Number.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();

    }

    private static void writeRomanNumber() throws Exception {
        File file1 = new File("Homework/Number.text");
        FileWriter fw = new FileWriter(file1);
        String a = scannRomanNumber();
        fw.write(a);
        fw.close();
    }

    private static String scannRomanNumber() {
        System.out.println("Enter the Roman number");
        char[] romanNumber = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        Scanner b = new Scanner(System.in);
        String a = b.next();
        char[] r = a.toCharArray();
        for (int i = 0; i < r.length; i++) {
            boolean rNumber = false;
            for (int j = 0; j < 7; j++) {
                if (r[i] == romanNumber[j]) {
                    rNumber = true;
                }

            }
            if (rNumber) {
            } else {
                System.out.println("The Number " + r[i] + " is not a Roman number");
            }
        }

        return a;
    }

    private static void writeArabicNumber() throws Exception {
        File file1 = new File("Homework/Number.text");
        FileWriter fw = new FileWriter(file1);
        String a = scannArabicNumber();
        fw.write(a);
        fw.close();
    }

    private static String scannArabicNumber() throws NegativeNumberExaption {
        System.out.println("Enter on Arabic number from 1 to 4000");
        Scanner c = new Scanner(System.in);
        int b = c.nextInt();
        if (b > 0 && b < 4001) {
        } else {
            throw new NegativeNumberExaption();
        }
        String d = String.valueOf(b);
        return d;
    }

    private static void arabicToRoman() throws Exception {
        ArabicNumber1000 a1000 = new ArabicNumber1000();
        ArabicNumber100 a100 = new ArabicNumber100();
        ArabicNumber10 a10 = new ArabicNumber10();
        ArabicNumber1 a1 = new ArabicNumber1();
        String a = a1000.getarabicOnetausend();
        String b = a100.getarabicHundred();
        String c = a10.getarabicTen();
        String d = a1.getarabicOne();
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
        System.out.print(d);
    }

    private static void romanToArabic() throws Exception{
        RomanToArabic number = new RomanToArabic();
        int a = number.getconvertRomanToArabic();
        System.out.println(a);

    }




}






