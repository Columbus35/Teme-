import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CarsRent {

    static Component frame;
    private static Icon icon;

    public static void main(String[] args) throws Exception {
        admin();
    }

    private static void file() throws Exception {
        File folder1 = new File("Homework");
        File file1 = new File("Homework/Car2.text");
        if (folder1.exists()) {
            System.out.println("");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("");
        } else file1.createNewFile();
    }

    private static void admin() throws Exception {
        Object[] options = {"Do you want buy a car for the Store",
                "You want visit the Store"};

        int n = JOptionPane.showOptionDialog(frame,
                "How can I help you ?",
                "Welcome in the Store",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);
        switch (n) {
            case 0:
                buyCar();
                break;
            case 1:
                visitTheStore();
                break;
        }
    }

    private static int checkIdNumber() {
        Random rnd = new Random();
        int x = 1000 + rnd.nextInt(10000 - 1000);
        return x;
    }

    private static int idNumber() throws Exception {
        int z = 0;
        boolean number = false;
        do {
            int x = checkIdNumber();
            FileInputStream fis = new FileInputStream("Homework/Car.text");
            Scanner s = new Scanner(fis);
            boolean check = true;
            while (s.hasNext()) {
                String a = s.nextLine() + "\n";
                String[] line = a.split(" ");
                int y = Integer.parseInt(line[2]);
                if (x == y) {
                    number = true;
                    check = false;
                }
            }
            if (check) {
                z += x;
            }
        } while (number);
        return z;
    }

    private static String markCar() {
        String s = (String) JOptionPane.showInputDialog(
                frame,
                "Pleas enter the mark of the car:\n",
                "Buy a new car",
                JOptionPane.PLAIN_MESSAGE,
                icon,
                null,
                "");
        return s;
    }

    private static String modelCar() throws Exception {
        String s = (String) JOptionPane.showInputDialog(
                frame,
                "Pleas enter the model of the car:\n",
                "Buy a new car",
                JOptionPane.PLAIN_MESSAGE,
                icon,
                null,
                "");
        char[] line = s.toCharArray();
        if (line.length > 15) {
            throw new Exception("The model not exist");
        }
        return s;
    }

    private static int price() throws Exception {
        String s = (String) JOptionPane.showInputDialog(
                frame,
                "Pleas enter the rental price:\n",
                "Buy a new car",
                JOptionPane.PLAIN_MESSAGE,
                icon,
                null,
                "");
        int x = Integer.parseInt(s);
        if (x < 0) {
            throw new Exception("The rent print cannot be negative");
        }
        return x;
    }

    private static int mileageCar() throws Exception {
        String s = (String) JOptionPane.showInputDialog(
                frame,
                "Pleas enter the mileage from the car",
                "Buy a new car",
                JOptionPane.PLAIN_MESSAGE,
                icon,
                null,
                "");
        int x = Integer.parseInt(s);
        if (x < 0) {
            throw new Exception("The mileage cannot be negative");
        }
        return x;
    }

    private static int yearCar() throws Exception {
        String s = (String) JOptionPane.showInputDialog(
                frame,
                "Pleas enter the constructions year from the car",
                "Buy a new car",
                JOptionPane.PLAIN_MESSAGE,
                icon,
                null,
                "");
        int x = Integer.parseInt(s);
        if (x < 1880) {
            throw new Exception("there were no cars this year");
        }
        return x;
    }

    private static String fuelCar() {
        Object[] possibilities = {"petrol", "diesel", "electric"};
        String s = (String) JOptionPane.showInputDialog(
                frame,
                "Pleas enter the fuel type of the car",
                "Buy a new car",
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                possibilities,
                "petrol");
        return s;
    }

    private static void buyCar() throws Exception {
        ArrayList<Car> vehicle = new ArrayList<Car>();
        Car auto = new Car(idNumber(), markCar(), modelCar(), price(), yearCar(), mileageCar(), fuelCar());
        vehicle.add(auto);
        int x = vehicle.size();
        File file1 = new File("Homework/Car.text");
        File file2 = new File("Homework/Car1.text");
        FileInputStream fis1 = new FileInputStream("Homework/Car.text");
        Scanner c = new Scanner(fis1);
        FileWriter fw = new FileWriter(file1, true);
        FileWriter fw2 = new FileWriter(file2, true);
        for (int i = 0; i < x; i++) {
            fw.write(vehicle.get(i) + "\n");
            fw.close();
            fw2.write(vehicle.get(i) + "\n");
            fw2.close();
        }
        visitTheStore();
    }


    private static void visitTheStore() throws Exception {
        Object[] options = {"Do you want buy a car on other car for the Store",
                "You want visit the Store"};

        int n = JOptionPane.showOptionDialog(frame,
                "What is you next step?",
                "Thank you for your help",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);
        switch (n) {
            case 0:
                buyCar();
                break;
            case 1:
                carStore();
                break;
        }
    }

    private static void carStore() throws Exception {
        Object[] options = {"Do you want check the list whit all Cars?",
                "Do you want rent a car?",
                "Do you want return a care?"};

        int n = JOptionPane.showOptionDialog(frame,
                "How can I help you?",
                "Welcome to the Store",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);
        switch (n) {
            case 0:
                allCarList();
                break;
            case 1:
                rentCar();
                break;
            case 2:
                returnCar();
                break;
        }
    }

    private static void allCarList() throws Exception {
        FileInputStream fis1 = new FileInputStream("Homework/Car.text");
        Scanner c = new Scanner(fis1);
        ArrayList<String> auto = new ArrayList<String>();
        while (c.hasNext()) {

            String a = c.nextLine() + "\n";
            auto.add(a);

        }
        JOptionPane.showMessageDialog(frame,
                auto);
        carStore();
    }

    private static String rentCar1() throws Exception {
        ArrayList<String> auto3 = new ArrayList<String>();
        FileInputStream fis1 = new FileInputStream("Homework/Car1.text");
        Scanner c = new Scanner(fis1);
        while (c.hasNext()) {
            String a = c.nextLine() + "\n";
            auto3.add(a);
        }
        String s = (String) JOptionPane.showInputDialog(
                frame,
                auto3 +
                        "Pleas enter the Id number from the car!",
                "Rent a car",
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                null,
                "");
        return s;
    }

    private static void rentCar() throws Exception {
        int x = Integer.parseInt(rentCar1());
        ArrayList<String> auto = new ArrayList<String>();
        ArrayList<String> auto1 = new ArrayList<String>();
        String at = "";
        String at1 = "";
        FileInputStream fis1 = new FileInputStream("Homework/Car1.text");
        FileInputStream fis = new FileInputStream("Homework/Car.text");
        Scanner c = new Scanner(fis1);
        Scanner c1 = new Scanner(fis);
        boolean same = false;
        boolean same1 = false;
        boolean same2 = false;
        while (c.hasNext()) {
            String a = c.nextLine() + "\n";
            String[] line = a.split(" ");
            if (x == Integer.parseInt(line[2])) {
                at1 += a;
                same = true;
            } else {
                at += a;
            }
        }
        while (c1.hasNext()) {
            String a = c1.nextLine() + "\n";
            String[] line = a.split(" ");
            if (x == Integer.parseInt(line[2])) {
                same1 = true;
                same2 = true;
            }
        }
        if (!same && same1) {
            JOptionPane.showMessageDialog(frame,
                    "The car whit this Id are rented");
        }
        if (!same && !same2) {
            JOptionPane.showMessageDialog(frame,
                    "The car whit this Id not exist");
        }
        auto.add(at);
        auto1.add(at1);
        File file3 = new File("Homework/Car1.text");
        FileWriter fw = new FileWriter(file3);
        File file2 = new File("Homework/Car2.text");
        FileWriter fw1 = new FileWriter(file2, true);
        for (int i = 0; i < auto1.size(); i++) {
            fw1.write(auto1.get(i));
            fw1.close();
        }
        for (int i = 0; i < auto.size(); i++) {
            fw.write(auto.get(i));
            fw.close();
        }
        if(same){
        JOptionPane.showMessageDialog(frame,
                "Do you rent this car: " + "\n" +
                        auto1);}

        carStore();
    }

    private static String returnCar1() throws Exception {
        ArrayList<String> auto3 = new ArrayList<String>();
        FileInputStream fis1 = new FileInputStream("Homework/Car2.text");
        Scanner c = new Scanner(fis1);
        while (c.hasNext()) {
            String a = c.nextLine() + "\n";
            auto3.add(a);
        }
        String s = (String) JOptionPane.showInputDialog(
                frame,
                auto3 +
                        "Pleas enter the Id number from the car!",
                "Return a car",
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                null,
                "");
        return s;
    }

    private static void returnCar() throws Exception {
        int x = Integer.parseInt(returnCar1());
        ArrayList<String> auto = new ArrayList<String>();
        ArrayList<String> auto1 = new ArrayList<String>();
        String at = "";
        String at1 = "";
        FileInputStream fis1 = new FileInputStream("Homework/Car2.text");
        FileInputStream fis = new FileInputStream("Homework/Car.text");
        Scanner c = new Scanner(fis1);
        Scanner c1 = new Scanner(fis);
        boolean same = false;
        boolean same1 = false;
        boolean same2 = false;
        while (c.hasNext()) {
            String a = c.nextLine() + "\n";
            String[] line = a.split(" ");
            if (x == Integer.parseInt(line[2])) {
                at1 += a;
                same = true;
            } else {
                at += a;
            }
        }
        while (c1.hasNext()) {
            String a = c1.nextLine() + "\n";
            String[] line = a.split(" ");
            if (x == Integer.parseInt(line[2])) {
                same1 = true;
                same2 = true;
            }
        }
        if (!same && same1) {
            JOptionPane.showMessageDialog(frame,
                    "The car whit this Id are returned");
        }
        if (!same && !same2) {
            JOptionPane.showMessageDialog(frame,
                    "The car whit this Id not exist");
        }
        auto.add(at);
        auto1.add(at1);
        File file3 = new File("Homework/Car2.text");
        FileWriter fw = new FileWriter(file3);
        File file2 = new File("Homework/Car1.text");
        FileWriter fw1 = new FileWriter(file2, true);
        for (int i = 0; i < auto1.size(); i++) {
            fw1.write(auto1.get(i));
            fw1.close();
        }
        for (int i = 0; i < auto.size(); i++) {
            fw.write(auto.get(i));
            fw.close();
        }
        if(same){
            JOptionPane.showMessageDialog(frame,
                    "Do you return this car: " + "\n" +
                            auto1);}

        carStore();
    }
}
