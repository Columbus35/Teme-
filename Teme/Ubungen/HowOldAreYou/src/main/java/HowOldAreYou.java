

import java.io.*;
import java.util.Scanner;

public class HowOldAreYou {

    public static void main(String[] args) throws IOException {
        File folder1 = new File("Homework");
        File file1 = new File("Homework/Number.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
        System.out.println("Enter you birthday(Y, M, D): ");
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        System.out.println("Enter the current date(Y, M, D): ");
        Scanner c = new Scanner(System.in);
        String b = c.nextLine();
        FileWriter fw = new FileWriter(file1);
        fw.write(a + " " + b);
        fw.close();
        System.out.println(" You are " + year() + " days old");

    }

    public static String einScann() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("Homework/Number.text");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner s = new Scanner(fis);
        String a = s.nextLine();
        String[] line = a.split(" ");
        String b = "";
        for (int i = 0; i < 3; i++) {
            b += line[i] + " ";
        }
        return b;
    }

    public static String einScann2() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("Homework/Number.text");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner s = new Scanner(fis);
        String a = s.nextLine();
        String[] line = a.split(" ");
        String b = "";
        for (int i = 3; i < 6; i++) {
            b += line[i] + " ";
        }

        return b;
    }

    public static int lapYear() {
        String[] start = einScann().split(" ");
        String[] end = einScann2().split(" ");
        int a = Integer.parseInt(start[0]);
        int b = Integer.parseInt(end[0]);
        int c = b - a;
        int year = 0;
        for (int i = 0; i <= c; i++) {
            if (a % 4 == 0 && a % 100 != 0) {
                year++;
            } else if (a % 100 == 0 && a % 400 == 0) {
                year++;
            }
            a++;
        }
        return year;
    }

    public static int firstYear() {
        String[] start = einScann().split(" ");
        int[] year = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int mont = Integer.parseInt(start[1]);
        int day = Integer.parseInt(start[2]);
        int days = 0;
        for (int i = 11; i >= mont - 1; i--) {
            days += year[i];
            if (i == mont - 1) {
                days -= year[i];
                days += year[i] - day;
            }
        }
        return days;
    }

    public static int lastYear() {
        String[] end = einScann2().split(" ");
        int[] year = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int mont = Integer.parseInt(end[1]);
        int day = Integer.parseInt(end[2]);
        int days = 0;
        for (int i = 0; i < mont; i++) {
            days += year[i];
            if (i == mont - 1) {
                days -= year[i];
                days += day;
            }
        }
        return days;
    }

    public static int year() {
        String[] start = einScann().split(" ");
        String[] end = einScann2().split(" ");
        int a = Integer.parseInt(start[0]);
        int b = Integer.parseInt(end[0]);
        int allDays = (b - a - 2) * 365;
        int allYears = firstYear() + lastYear() + lapYear() + allDays;
        return allYears;
    }


}
