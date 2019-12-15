public class AmericanFlage {

    public static void main(String[] args) {

        String x = "==";
        String z = "* ";
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 25; j++) {
                if (i <= 5 && j <= 7) {
                    System.out.print(z);
                } else System.out.print(x);
            }
            System.out.println("");
        }


    }
}





