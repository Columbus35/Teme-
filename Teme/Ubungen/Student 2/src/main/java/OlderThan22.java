import java.io.FileNotFoundException;

public class OlderThan22 {

    private static String olderThat() throws FileNotFoundException {
        Statistics number = new Statistics();
        Student[] people = number.getScanningDate();
        String name = "";
        for(int i = 0; i < people.length; i++){
            if(people[i].getAge() > 22){
                name += people[i].getFirstName() + " " + people[i].getLastName() + "\n";
            }
        }
        return name;
    }


    public String getOlderThat() throws FileNotFoundException{
        return olderThat();
    }








}
