import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        int a;
            System.out.println("Enter you number");
            Scanner s = new Scanner(System.in);
             a = s.nextInt() ;
            if (a % 2 == 0) {
                System.out.println("The number is Even");
            } else System.out.println("The number is Odd");
        }
    }





