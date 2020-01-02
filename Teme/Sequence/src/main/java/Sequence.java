import java.util.Scanner;

public class Sequence {

    public static void main(String[] args) {
        int value;
        int value1;
        System.out.println("Enter you number");
        Scanner s = new Scanner(System.in);
        value = s.nextInt();
        String b = String.valueOf(value);
        value1 = Integer.parseInt(b);
        int x = b.length();
        int number;
        int number2;


        boolean sequence2 = false;
        boolean sequence = false;
        for (int i = 0; i < x; ++i) {
            number = value % 10;
            value = value / 10;
            number2 = value % 10;
            --number;

            if (number == number2) {
                sequence = true;
            } else sequence= false; break;

        }

        for (int j = 0; j < x; ++j) {
            number = value1 % 10;
            value1 = value1 / 10;
            number2 = value1 % 10;
            --number2;

            if (number == number2) {
                sequence2 = true;
            } else break;

        }

        if (sequence2 || sequence) {
            System.out.println("The number: " + b + " is a Sequence");
        } else System.out.println("The number: " + b + " is not a Sequence");


    }
}
