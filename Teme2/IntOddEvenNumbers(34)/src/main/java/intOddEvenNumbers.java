import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class intOddEvenNumbers {

    public intOddEvenNumbers() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        printOut();

    }

    public static String einscannen() throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/Numbers.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homwork/Numbers.text");
        Scanner s = new Scanner(fis);
        String numbers = s.nextLine();
        return numbers;
    }

    public static int[] allNumbers() throws IOException {
        String[] line = einscannen().split(" ");
        int[] digits = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            digits[i] += Integer.parseInt(line[i]);
        }
        return digits;
    }

    public static String oddNumber() throws IOException {
        int[] numbers = allNumbers();
        String odd = "";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                odd += String.valueOf(numbers[i] + " ");
            }
        }
        return odd;
    }

    public static String evenNumber() throws IOException {
        int[] numbers = allNumbers();
        String even = "";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even += String.valueOf(numbers[i] + " ");
            }
        }
        return even;
    }

    public static void printOut() throws IOException {
        String allNumbers = oddNumber() + evenNumber();
        String[] line = allNumbers.split(" ");
        int[] digits = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            digits[i] += Integer.parseInt(line[i]);
        }
        System.out.print("Even and Odd numbers: ");
        for (int j = 0; j < line.length; j++) {
            System.out.print(digits[j] + ", ");
        }

    }


}
