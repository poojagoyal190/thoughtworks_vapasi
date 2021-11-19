package Assignments;

public class MethodOverloading {
    public static void main(String[] args) {

        MethodOverloading number = new MethodOverloading();
        int largest1 = number.largestNumber(4, 1);
        int largest2 = number.largestNumber(6, 2, 9);

        System.out.println(largest1);
        System.out.println(largest2);
    }

    public int largestNumber(int a, int b) {
        int num1 = a;
        int num2 = b;
        if (num1 > num2)
            return num1;
        else
            return num2;

    }

    public int largestNumber(int a, int b, int c) {
        int num1 = a;
        int num2 = b;
        int num3 = c;
        if (num1 > num2 && num1 > num3)
            return num1;
        else if (num1 > num2 && num3 > num1)
            return num3;
        else if (num1 < num2 && num2 > num3)
            return num2;
        else
            return 1;
    }
}


