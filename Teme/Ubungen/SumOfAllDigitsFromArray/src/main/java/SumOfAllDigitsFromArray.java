import java.util.Scanner;

public class SumOfAllDigitsFromArray {


    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows/lines");
        int a = s.nextInt();
        int x = 0;
        if (a > 1) {
            x = a;
        } else {
            throw new NegativeNumberExaption();
        }
        int[][] original = new int[x + 1][x + 1];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.println("Enter the number");
                original[i][j] = s.nextInt();
                original[i][x] += original[i][j];
            }
            original[x][x] += original[i][x];
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                original[x][i] += original[j][i];
            }
        }

        System.out.println("The original array are:");

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The sum of all digits from array are:");

        for (int i = 0; i < x + 1; i++) {
            for (int j = 0; j < x + 1; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }

    }


}

