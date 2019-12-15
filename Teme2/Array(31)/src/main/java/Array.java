import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Array {


    public static void main(String[] args) throws IOException {

   printing();
    }


    public static String einscannen() throws IOException {
        File folder1 = new File("Homwork");
        File file1 = new File("Homwork/Array.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        FileInputStream fis = new FileInputStream("Homwork/Array.text");
        Scanner s = new Scanner(fis);
        String numbers = "";
        for (int i = 0; i < 2; i++) {
            String a = s.nextLine();
            numbers += a;
        }
        return numbers;
    }

    public static int[] arrayOne() throws IOException {
        String in = einscannen();
        String[] line = in.split(" ");
        int number = Integer.parseInt(line[0]);
        int number2 = Integer.parseInt(line[1]);
        int number3 = Integer.parseInt(line[2]);
        int[] lineOne = {number, number2, number3};
        return lineOne;


    }

    public static int[] arrayTwo() throws IOException {
        String in = einscannen();
        String[] line = in.split(" ");
        int number = Integer.parseInt(line[3]);
        int number2 = Integer.parseInt(line[4]);
        int number3 = Integer.parseInt(line[5]);
        int[] lineOne = {number, number2, number3};
        return lineOne;


    }

    private static void printing() throws IOException {
       int[] out = arrayOne();
       int[] out2 = arrayTwo();
        System.out.print("Array One: [ ");
       for(int i = 0; i < 3; i++){
           System.out.print(out[i] + ", ");
       }
       System.out.print("]");
       System.out.println("");
        System.out.print("Array Two: [ ");
        for(int i = 0; i < 3; i++){
            System.out.print(out2[i] +", ");
        }
        System.out.print("]");
        System.out.println("");
        System.out.print("New Array: [ ");
        System.out.print(out[0]+", "+out2[2] +"]");


    }

}



