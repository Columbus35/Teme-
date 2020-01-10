public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private String department;
    private double generalGrade;

    public  Student( String firstName, String lastName, int age, String department, double generalGrade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.department = department;
        this.generalGrade = generalGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public double getGeneralGrade() {
        return generalGrade;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGeneralGrade(double generalGrade) {
        this.generalGrade = generalGrade;
    }

}
