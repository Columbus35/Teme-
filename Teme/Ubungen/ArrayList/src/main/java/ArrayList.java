import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ArrayListTest {

    public static void main(String[] args){

        int [] lin = {5, 7, 1, 6, 9, 2};
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < lin.length; i++){
            numbers.add(lin[i]);
        }
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

    }





}
