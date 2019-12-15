import java.util.Calendar;

public class Time {

    public static void main(String[] args) {
        Calendar time = Calendar.getInstance();
        time.add(Calendar.HOUR,3);
        System.out.println("The time is: " + time.get(Calendar.HOUR) + " : "
                                           + time.get(Calendar.MINUTE) + " : "
                                           + time.get(Calendar.SECOND));
    }
}
