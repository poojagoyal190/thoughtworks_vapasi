package Assignments;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of the operation you want to perform: 1.Add 2.Sub 3.Multiply 4.Division");
            int operation = scanner.nextInt();

            System.out.println("Enter number1: ");
            int num1 = scanner.nextInt();

            System.out.println("Enter number1: ");
            int num2 = scanner.nextInt();

            System.out.print("Do you want to continue Y or N ? ");
            String str = scanner.nextLine();
        if(str=="Y")
        {
            System.out.println("Enter the number of the operation you want to perform: 1.Add 2.Sub 3.Multiply 4.Division");
            int operation1 = scanner.nextInt();

            System.out.println("Enter number1: ");
            int num3 = scanner.nextInt();

            System.out.println("Enter number1: ");
            int num4 = scanner.nextInt();

            System.out.print("Do you want to continue Y or N ? ");
            String str1 = scanner.nextLine();
        }
            switch (operation) {
                case 1 -> System.out.println("The result of addition is:" + (num1 + num2));
                case 2 -> System.out.println("The result of subtraction is:" + (num1 - num2));
                case 3 -> System.out.println("The result of Multiplication is:" + (num1 * num2));
                case 4 -> System.out.println("The result of Division is:" + (num1 / num2));

            }

        }
    }

