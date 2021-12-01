package Assignments;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont;
        do {
            System.out.println("Enter the number of the operation you want to perform: 1.Add 2.Sub 3.Multiply 4.Division");
            int operation = scanner.nextInt();

            System.out.println("Enter number1: ");
            int num1 = scanner.nextInt();

            System.out.println("Enter number1: ");
            int num2 = scanner.nextInt();


            switch (operation) {
                case 1 -> System.out.println("The result of addition is:" + (num1 + num2));
                case 2 -> System.out.println("The result of subtraction is:" + (num1 - num2));
                case 3 -> System.out.println("The result of Multiplication is:" + (num1 * num2));
                case 4 -> System.out.println("The result of Division is:" + (num1 / num2));
            }
            System.out.print("Do you want to continue Press 1 ");
            cont = scanner.nextInt();
        } while (cont == 1);
    }
}

