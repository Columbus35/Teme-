import java.io.FileNotFoundException;

public class LongLastName {

    private static String longName() throws FileNotFoundException {
        Statistics number = new Statistics();
        Student[] people = number.getScanningDate();
        String name = "";
        for(int i = 0; i < people.length; i++){
            char[] lname = people[i].getLastName().toCharArray();
            if(lname.length > 5){
                name += people[i].getFirstName() + " " + people[i].getLastName() + "\n";
            }
        }
        return name;
    }


    public String getLongName() throws FileNotFoundException{
        return longName();
    }







}
