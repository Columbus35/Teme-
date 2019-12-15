import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class DistanceOfEarth {
    public static void main(String[] args) throws IOException {
    File folder1 = new File("Homwork");
    File file1 = new File("Homwork/Distance.text");
        if (folder1.exists()) {
        System.out.println("Folder exists");
    } else folder1.mkdir();
        if (file1.exists()) {
        System.out.println("File exists");
    } else file1.createNewFile();
    FileInputStream fis = new FileInputStream("Homwork/Distance.text");
    Scanner s = new Scanner(fis);
    String a = s.nextLine();
    String[] line = a.split(" ");
    String number = line[0];
    String number2 = line[1];
    String number3 = line[2];
    String number4 = line[3];
    String number5 = line[4];
    double x1 = Double.parseDouble(number);
    double y1 = Double.parseDouble(number2);
    double x2 = Double.parseDouble(number3);
    double y2 = Double.parseDouble(number4);
    double r = Double.parseDouble(number5);
    double distance = r * (Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
    System.out.println("The distance between the 2 points are: " + distance + " km");















    }}
