import java.util.Scanner;

public class summation {
    public static void main(String[] args) {
        System.out.println("enter number1");

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        System.out.println("enter number2");
        int num2 = scanner.nextInt();

        System.out.println("enter number2");
        int num3 = scanner.nextInt();
        int sum = 0;
        int sum2 = addNumber(num1, num2);
        int sum3 = addNumber(num1, num2, num3);
        System.out.println(sum2);
        System.out.println(sum3);
    }
        static int addNumber(int num1, int num2){
           int sum = num1+ num2;
            System.out.println();
            return sum;
        };

        static int addNumber(int num1, int num2, int num3){
            int sum = num1+ num2 + num3;
            System.out.println();
            return sum;
        }


    }