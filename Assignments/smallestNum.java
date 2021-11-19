package Assignments;
import java.util.Scanner;

public class smallestNum {

    public static void main(String[] args) {
        System.out.println("enter number1");

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        System.out.println("enter number2");
        int num2 = scanner.nextInt();

        System.out.println("enter number3");
        int num3 = scanner.nextInt();
        int small = 0;
        if (num1 > num2) {
                if (num2 > num3) {
                    small = num3;
                }else small= num2;
            }
       else if (num1 < num2) {
            if (num3 < num2) {
                small = num3;
            }else small= num1;
        }
        System.out.println("This is the smallest number is " + small);
    }
}
