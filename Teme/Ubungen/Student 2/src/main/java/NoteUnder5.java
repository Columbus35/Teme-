import java.io.FileNotFoundException;

public class NoteUnder5 {

    private static String underFive() throws FileNotFoundException {
        Statistics number = new Statistics();
        Student[] people = number.getScanningDate();
        String name = "";
        for(int i = 0; i < people.length; i++){
            if(people[i].getGeneralGrade() < 5){
                name += people[i].getFirstName() + " " + people[i].getLastName() + "\n";
            }
        }
        return name;
    }


    public String getUnderFive() throws FileNotFoundException{
        return underFive();
    }







}
