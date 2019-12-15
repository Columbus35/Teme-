public class Lotto {

    public static void main(String[] args) {

    long number = 0;

     for(int i = 1; i < 49; i++){
         for(int j = 1; j < 49; j++){
             for(int h = 1; h < 49; h++){
                 for(int k = 1; k < 49; k++){
                     for(int l = 1; l < 49; l++){
                         for(int m = 1; m < 49; m++){
                                ++number;
                         }
                     }
                 }
             }
         }
     }
     System.out.println(number);






    }


}
