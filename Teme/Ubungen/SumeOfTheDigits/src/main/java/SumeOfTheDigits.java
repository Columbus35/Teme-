import java.util.Scanner;

public class SumeOfTheDigits {

    public static void main(String[] args) {
      System.out.println("The sum of all Digits are: " + resultOfDigits());

    }

    public static int einScannen() {
        System.out.println("Please enter the number");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        return a;
    }

    public static int resultOfDigits(){
        int a = einScannen();
        String b = String.valueOf(a);
        int result = 0;
        for(int i = 0; i < b.length(); i++){
            int number = a % 10;
            a = a / 10;
            result += number;
        }
        return result;
    }



}
