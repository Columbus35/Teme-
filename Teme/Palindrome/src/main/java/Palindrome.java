import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        int value;
        System.out.println("Enter you number");
        Scanner s = new Scanner(System.in);
        value = s.nextInt();
        String b = String.valueOf(value);
        String reverse = "";
        for (int i = b.length() - 1; i >= 0; --i) {
            reverse += b.charAt(i);
        }
        boolean palindrome = true;

        for (int i = 0; i < b.length(); ++i) {
            if (b.charAt(i) != reverse.charAt(i)) {
                palindrome = false;
            }

        }
        if (palindrome) {
            System.out.println("The number " + value + " is a Pallindrome");
        }
        else System.out.println("The number "+ value + " is not a Pallindrome" );
    }
}
