import java.util.Scanner;

public class AllZeroDigitsOfTheRight {

    public static void main(String[] args) {
        zeroArray();
    }

    public static int[] einScannen(){
        System.out.println("Please enter a number that contain one ore more 0 digits");
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] line = a.split(" ");
        int nul= 0;
        int[] number = new int[line.length];
        for(int i = 0; i < line.length; i++){
            number[i] = Integer.parseInt(line[i]);
            if(number[i] == 0){
                nul += 1;
            }
        }
        if(nul == 0){
            try {
                throw new NegativeNumberExaption();
            } catch (NegativeNumberExaption negativeNumberExaption) {
                negativeNumberExaption.printStackTrace();
            }
        }
        return number;
    }

    public static void zeroArray() {
        int[] number1 = einScannen();
        boolean zero = true;
        while (zero){
            zero = false;
        for (int i = 0; i < number1.length - 1; i++) {
            if (number1[i] == 0 && number1[i + 1] != 0) {
                move(number1, i, i + 1);
                zero = true;
            }
        }
    }
        System.out.println("The reorganized array are: ");
        for(int i = 0; i < number1.length; i++){
            System.out.print(number1[i] + " ");
        }
    }

    public static void move (int[] number1, int a, int b){
         int loop = number1[a];
         number1[a] = number1[b];
         number1[b] = loop;

    }
}
