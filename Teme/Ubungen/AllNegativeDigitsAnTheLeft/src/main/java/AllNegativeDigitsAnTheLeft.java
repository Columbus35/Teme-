import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AllNegativeDigitsAnTheLeft {

    public static void main(String[] args) {
      sortDigits();
    }

    public static int[] einScannen() {
        System.out.println("Please enter positive and negative numbers");
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] line = a.split(" ");
        int positive = 0;
        int negative = 0;
        int[] numbers = new int[line.length];
        for(int i = 0; i < line.length; i++){
            numbers[i] = Integer.parseInt(line[i]);
            if(numbers[i] >= 0){
                positive += 1;
            }else if(numbers[i] <= 0){
                negative += 1;
            }
        }
        if(positive == line.length || negative == line.length){
            try {
                throw new NegativeNumberExaption();
            } catch (NegativeNumberExaption negativeNumberExaption) {
                negativeNumberExaption.printStackTrace();
            }
        }
        return numbers;
    }

    public static void sortDigits(){
        int[] numbers = einScannen();
        List<Integer> array = new ArrayList<Integer>();
        for(int i = 0; i < numbers.length; i++){
            array.add(numbers[i]);
        }
        Collections.sort(array);
        System.out.println(array);
    }

}
