import java.io.FileNotFoundException;

public class Matematic22OldAndNote6 {

    private static String mOlder() throws FileNotFoundException {
        Statistics number = new Statistics();
        Student[] people = number.getScanningDate();
        char lern = 'M';
        String name = "";
        for(int i = 0; i < people.length; i++){
            char[] profil = people[i].getDepartment().toCharArray();
            boolean mate = false;
            boolean age = false;
            boolean note = false;
            if(profil[0] == lern){mate = true;}
            if(people[i].getAge() > 22){age = true;}
            if(people[i].getGeneralGrade() > 6){note = true;}
            if(mate && age && note){
                name += people[i].getFirstName() + " " + people[i].getLastName() + "\n";
            }
        }
        return name;
    }


    public String getMOlder() throws FileNotFoundException{
        return mOlder();
    }







}
