import java.util.Scanner;

public class SimilarDigits {

    public static void main(String[] args) {
        int value;
        System.out.println("Enter you number");
        Scanner s = new Scanner(System.in);
        value = s.nextInt();
        String b = String.valueOf(value);
        String reverse = "";
        String original = "";
        int i = b.length() - 1;
        reverse += b.charAt(i);
        int j = 0;
        original += b.charAt(j);


        System.out.println("Enter you number 2");
        Scanner p = new Scanner(System.in);
        int value1;
        value1 = p.nextInt();
        String c = String.valueOf(value1);
        String reverse1 = "";
        String original1 = "";
        int x = c.length() - 1;
        reverse1 += c.charAt(x);
        int y = 0;
        original1 += c.charAt(y);

        int number = Integer.parseInt(original);
        int number2 = Integer.parseInt(original1);
        int number3 = Integer.parseInt(reverse);
        int number4 = Integer.parseInt(reverse1);

        if ( number == number2 && number3 == number4){
                System.out.println("Number " + b + " and number " + c + " have the same first and last digits");
            }
         else System.out.println("Number " + b + " and number " + c + " not have the same first and last digits");


    }


}
