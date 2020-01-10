import java.io.FileNotFoundException;

public class StudentsGradesAbove {

 private static String gradesAbove() throws FileNotFoundException {
     Statistics number = new Statistics();
     Student[] people = number.getScanningDate();
     String name = "";
     for(int i = 0; i < people.length; i++){
         if(people[i].getGeneralGrade() > 6.5){
             name += people[i].getFirstName() + " " + people[i].getLastName() + "\n";
         }
     }
     return name;
 }


public String getGradesAbove() throws FileNotFoundException{
     return gradesAbove();
}



}
