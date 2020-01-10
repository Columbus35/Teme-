import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Statistics {

    public static void main(String[] args) throws Exception {
        scanningDate();
        System.out.println("1. Students which have grades above 6.5.");
        StudentsGradesAbove st = new StudentsGradesAbove();
        String name = st.getGradesAbove();
        System.out.println(name);
        System.out.println("2. Students which are older than 22");
        OlderThan22 ag = new OlderThan22();
        String name1 = ag.getOlderThat();
        System.out.println(name1);
        System.out.println("3. Students which have a grade higher than 5 and are in the Informatica department.");
        InformaticDepartment info = new InformaticDepartment();
        String name2 = info.getPrograming();
        System.out.println(name2);
        System.out.println("4. Students which failed the exam. (grade below 5)");
        NoteUnder5 nt = new NoteUnder5();
        String name3 = nt.getUnderFive();
        System.out.println(name3);
        System.out.println("5. Students which have lastname longer than 5 characters");
        LongLastName ne = new LongLastName();
        String name4 = ne.getLongName();
        System.out.println(name4);
        System.out.println("6. Students which are in the Matematica department and are older than 22 and have grades higher than 6.");
        Matematic22OldAndNote6 ag1 = new Matematic22OldAndNote6();
        String name5 = ag1.getMOlder();
        System.out.println(name5);
    }

    private static void file() throws Exception {
        File folder1 = new File("Homework");
        File file1 = new File("Homework/Student.text");
        if (folder1.exists()) {
            System.out.println("Folder exists");
        } else folder1.mkdir();
        if (file1.exists()) {
            System.out.println("File exists");
        } else file1.createNewFile();
    }

    private static Student[] scanningDate() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("Homework/Student.text");
        Scanner s = new Scanner(fis);
        Student[] people = new Student[10];
        for (int i = 0; i < 10; i++) {
            String a = s.nextLine() + "\n";
            String[] line = a.split(" ");
            people[i] = new Student(line[0], line[1], Integer.parseInt(line[2]), line[3], Double.parseDouble(line[4] ));

        }
      return people;
    }

     public Student[] getScanningDate() throws FileNotFoundException{
        return scanningDate();
     }
}
