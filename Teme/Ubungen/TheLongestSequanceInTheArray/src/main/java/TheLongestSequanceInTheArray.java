import java.util.Scanner;

public class TheLongestSequanceInTheArray {

    public static void main(String[] args) {
        System.out.println("The largest sequense in the arrey are: " +calculatorLength());
    }

    public static int[] einScann() {
        System.out.println("Enter numbers in sequence");
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] line = a.split(" ");
        int[] number = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            number[i] = Integer.parseInt(line[i]);
        }

        return number;
    }

    public static int calculatorLength() {
        int[] line = einScann();
        int result = 0;
        int start = 0;
        int end = 0;
        boolean flag = true;
        for(int i = 0; i < line.length -1; i++){
            int number = line[i];
            int number2 = line[i + 1];
            if(number + 1 == number2 && flag){
                start = number;
                flag = false;
            } if(!flag && number + 1 != number2 ){
                end = number;
                flag = true;
            }
            if(end - start > result){
                result = end - start;
            }
        }

        return result;
    }

}
