import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        perfect();
    }


    public static int einScann() {
        System.out.println("Enter the max number");
        Scanner c = new Scanner(System.in);
        int a = c.nextInt();
        return a;
    }

    public static void perfect() {
        int a = einScann();
        for (int i = 2; i < a; i++) {
            if(i % 2 == 0) {
                int number = 0;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        number += j;
                    }
                }
                if (number == i) {
                    System.out.println(number);
                }
            }
        }

    }
}
