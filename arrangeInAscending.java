import java.util.Scanner;

public class arrangeInAscending {

    public static void main(String[] args) {
        System.out.println("enter number1");

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        System.out.println("enter number2");
        int num2 = scanner.nextInt();

        System.out.println("enter number3");
        int num3 = scanner.nextInt();

        for(int i=0; i<3;i++) {
            if (num1 > num2) {
                int a = num2;
                num2 = num1;
                num1 = a;
            } else if (num1 > num3) {
                int b = num3;
                num3 = num1;
                num1 = b;
            } else if (num2 > num3) {
                int c = num3;
                num3 = num2;
                num2 = c;
            }

        }
        System.out.println("The numbers in order " + num1 + num2+ num3);
    }
}
