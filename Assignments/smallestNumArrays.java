package Assignments;
import java.util.Scanner;

public class smallestNumArrays {

        public static void main(String[] args) {
            int temp = 0;
            System.out.println("Enter how many numbers you want to sort");
            Scanner scanner = new Scanner(System.in);
            int num1 = scanner.nextInt();

            int[] arrayArrange = new int[num1];
            System.out.println("Enter the numbers you want to sort");
            for (int i = 0; i < num1; i++) {
                arrayArrange[i] = scanner.nextInt();
            }

            int small = arrayArrange[0];
            for (int i = 1 ; i < num1; i++)
                    if(small > arrayArrange[i]){
                        small = arrayArrange[i];
                }

            System.out.println("This is the smallest number is " + small);
        }
    }
