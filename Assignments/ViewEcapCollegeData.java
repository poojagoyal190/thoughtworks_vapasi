package Assignments;

public class ViewEcapCollegeData {
    public static void main(String[] args) {

            EncapCollegeData encapCollegeData = new EncapCollegeData();
            encapCollegeData.setCollegeName1("Arya College of Engineering");
            encapCollegeData.setCollegeName2("Rajasthan College of Management");
            encapCollegeData.setCollegeName3("Jaganath College of Engineering");
            encapCollegeData.setCollegeName4("Amity College of Commerce");
            encapCollegeData.setCollegeName5("Cambridge College of Engineering");

            encapCollegeData.setDepartment1("IT");
            encapCollegeData.setDepartment2("CSE");
            encapCollegeData.setDepartment3("EEE");
            encapCollegeData.setDepartment4("ECE");
            encapCollegeData.setDepartment5("AERO");


            System.out.println("College names are: "+ encapCollegeData.getCollege1()+" And "+ encapCollegeData.getCollege2() +" And "+ encapCollegeData.getCollege3()+" And "+ encapCollegeData.getCollege4()+" And "+ encapCollegeData.getCollege5());
            System.out.println( "Departments in colleges are: "+encapCollegeData.getDepart1()+" And "+encapCollegeData.getDepart2()+encapCollegeData.getDepart3()+" And "+encapCollegeData.getDepart4()+" And "+encapCollegeData.getDepart5());

    }
}
