import java.util.Scanner; //import util hpackage for Scanner class
public class inputweek {

    public static void main(String args[]) {
       int date = 11;
       // Scanner s = new Scanner(System.in);
        int value = date%7;
        //System.out.println("Enter a number between 1-30:");

        // Printing weekday
        if(date > 30){
            System.out.println("invalid input");
        }else if (value==0) {
            System.out.println("The day today is: Sunday");
        } else if (value==1){
            System.out.println("The day today is: Monday");
        }else if (value == 2){
            System.out.println("The day today is: Tuesday");
        }else if (value == 3){
            System.out.println("The day today is: Wednesday");
        }else if (value == 4){
            System.out.println("The day today is: Thursday");
        }else if (value == 5){
            System.out.println("The day today is: Friday");
        }else if (value == 6) {
            System.out.println("The day today is: Saturday");
        }
       // s.close();

    }
}