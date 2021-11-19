package Assignments;
import java.util.Scanner;

public class arrangeInAscendingArrays {

    public static void main(String[] args) {
        int temp;
        System.out.println("Enter the no. of elements you want to arrange");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        int[] arrayArrange = new int[num1];
        System.out.println("Enter the numbers");
        for (int i = 0; i < num1; i++) {
            arrayArrange[i] = scanner.nextInt();
        }

        for (int i = 0; i < num1; i++) {
            for (int j =i+1; j<num1; j++) {
            if(arrayArrange[i]>arrayArrange[j]){
                temp = arrayArrange[i];
                arrayArrange[i] = arrayArrange[j];
                arrayArrange[j] = temp;
            }
            }
        }

        System.out.println("The numbers in order are: ");
        for (int i = 0; i < num1; i++) {
            System.out.println(arrayArrange[i]);
        }
    }
}

