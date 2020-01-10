import java.io.FileNotFoundException;

public class InformaticDepartment {

    private static String programing() throws FileNotFoundException {
        Statistics number = new Statistics();
        Student[] people = number.getScanningDate();
        char lern = 'I';
        String name = "";
        for(int i = 0; i < people.length; i++){
            char[] profil = people[i].getDepartment().toCharArray();
            if(people[i].getGeneralGrade() > 5 && profil[0] == lern){
                name += people[i].getFirstName() + " " + people[i].getLastName() + "\n";
            }
        }
        return name;
    }


    public String getPrograming() throws FileNotFoundException{
        return programing();
    }




}
