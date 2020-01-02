import java.util.Comparator;

abstract class IntegerLengthComparator implements Comparator<Integer> {

    public int compare(Integer s1, Integer s2){
        int len1 = s1;
        int len2 = s2;
        if(len1 < len2){
            return 1;
        }else if(len1 > len2){
            return -1;
        }
        return 0;
    }

}
