public class LetterShers {

    public static void main(String[] args) {
        int number = 0;
        char[] le = {'O','E', 'L', 'T', 'A', 'A', 'K', 'A', 'C', 'C'};
        char[] le1= {'1','0','1','1','0','0','1','0','1','1'};
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    for (int m = 0; m < 9; m++) {
                        if (le[i] != le[j] && le[i] != le[k] && le[i] != le[m] && le[j] != le[k] && le[j] != le[m]
                                && le[k] != le[m]) {
                            ++number;
                           System.out.println(le[i] + " " + le[j] + " " + le[k] + " " + le[1]+ " " + le[m]);
                        }
                    }
                }
            }
        }

     System.out.println(number);
    }

}






