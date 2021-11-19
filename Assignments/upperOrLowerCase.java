import java.util.Scanner;

public class upperOrLowerCase {
    public static void main(String[] args) {
        System.out.println("enter a character");

        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        if(ch>='a'&& ch<='z')
            System.out.println("The character is in Lowercase ");
        else if(ch>='A'&& ch<='Z')
        System.out.println("The character is in Uppercase ");
        else
            System.out.println("Wrong input ");
    }
}