import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDay {

    public static void main(String[] args) {

         Date actuelDate = new Date();
         System.out.println(actuelDate);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.print(dateFormat.format(actuelDate)+ "   ");
        System.out.print(timeFormat.format(actuelDate));




    }
}
