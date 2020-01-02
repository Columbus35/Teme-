import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PiramideFormeFromNumbers {

    public static void main(String[] args) throws Exception {
        fileCreate();
        writeNumber();
       System.out.println("The Piramide form of the numbers is: ");
       System.out.print(eveanNumbers()+ "" + oddNumbers());
    }

    private static void fileCreate() throws Exception {
        File folder1 = new File("Homework");
        File file1 = new File("Homework/Number.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();

    }

    private static void writeNumber() throws Exception {
        File file1 = new File("Homework/Number.text");
        FileWriter fw = new FileWriter(file1);
        System.out.println("Enter 5 odd an 5 evan numbers");
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        fw.write(a);
        fw.close();
    }

    private static ArrayList<Integer> eveanNumbers() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("Homework/Number.text");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner s = new Scanner(fis);
        String a = s.nextLine();
        String[] line = a.split(" ");
        int [] line1 = new int[line.length];
        for(int i = 0; i < line.length; i++){
            line1[i] += Integer.parseInt(line[i]);
        }
        List<Integer> number = new ArrayList<Integer>();
        for(int i = 0; i < line1.length; i++){
            if(line1[i] % 2 == 0){
                number.add(line1[i]);
            }
        }
        Collections.sort(number);

        return (ArrayList<Integer>) number;
    }


    private static ArrayList<Integer> oddNumbers() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("Homework/Number.text");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner s = new Scanner(fis);
        String a = s.nextLine();
        String[] line = a.split(" ");
        int [] line1 = new int[line.length];
        for(int i = 0; i < line.length; i++){
            line1[i] += Integer.parseInt(line[i]);
        }
        List<Integer> number = new ArrayList<Integer>();
        for(int i = 0; i < line1.length; i++){
            if(line1[i] % 2 != 0){
                number.add(line1[i]);
            }
        }
        Collections.sort(number, new IntegerLengthComparator() {
            public int compare(Integer s1, Integer s2) {
                return super.compare(s1, s2);
            }
        });
        return (ArrayList<Integer>) number;
    }

}
