import java.util.Scanner;

public class ArmstrongChecker {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = SC.nextInt();

        int originalNumber = number;
        int digits = 0;

        
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        int result = 0;
        temp = number;

        
        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, digits);
            temp /= 10;
        }

        
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong number.");
        }
    }
}
