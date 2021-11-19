public class ScienceStudents extends Student1 {

    int business = 10;
    int accounts = 35;
    int economics = 50;

    public static void main(String[] args) {

        ScienceStudents St1 = new ScienceStudents();
        //St1("Aravind", 23);

        System.out.println("The student information:" + St1.name + St1.accounts + St1.economics + St1.roll + St1.business);
    }


}
