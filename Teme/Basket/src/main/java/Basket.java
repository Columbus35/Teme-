public class Basket {

    public static void main(String[] args) {

        Student one1 = new Student("Markus", 180);
        one1.name = "Markus";
        one1.hight = 180;
        if (one1.hight > 150) {
            System.out.println(one1.name);
        }

        Student one2 = new Student("Alex", 178);
        one2.name = "Alex";
        one2.hight = 178;
        if (one2.hight > 150) {
            System.out.println(one2.name);
        }

        Student one3 = new Student("Felix", 149);
        one3.name = "Felix";
        one3.hight = 149;
        if (one3.hight > 150) {
            System.out.println(one3.name);
        }


    }


}
