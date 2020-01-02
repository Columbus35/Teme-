import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
      lapYear();
    }

    public static int systemin() {
        System.out.println("Enter the start Year hear: ");
        Scanner s = new Scanner(System.in);
        String a = s.next();
        int b = Integer.parseInt(a);
        return b;
    }

    public static int systemin2() {
        System.out.println("Enter the last Year hear: ");
        Scanner s = new Scanner(System.in);
        String a = s.next();
        int b = Integer.parseInt(a);
        return b;
    }

    public static void lapYear(){
        int start = systemin();
        int end = systemin2();
        int c = end - start;
        for(int i = 0; i <= c; i++){
            if(start % 4 == 0 && start % 100 !=0){
                System.out.println(start);
            } else if(start % 100 == 0 && start % 400 == 0 ){
                System.out.println(start);
            }
            start++;
        }

    }
}
