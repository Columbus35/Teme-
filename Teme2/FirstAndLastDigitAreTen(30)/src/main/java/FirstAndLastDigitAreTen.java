import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FirstAndLastDigitAreTen {

    public static void main(String[] args) throws IOException {
        outPrint();

    }

    public static String einscannen() throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/First last digit.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homwork/First last digit.text");
        Scanner s = new Scanner(fis);
        String numbers = s.nextLine();
        return numbers;
    }

    public static String[] arrayOne() throws IOException {
        String[] numeber = einscannen().split(" ");
        return numeber;

    }

    public static void outPrint() throws IOException{
        String[] array = arrayOne();
        int number = Integer.parseInt(array[0]);
        int i = array.length -1;
        int number2 = Integer.parseInt(array[i]);
        if (number == 10 && number2 == 10){
            System.out.println("The first and last digit are 10");
        } else System.out.println("The first and last digit not are 10");
    }


}
