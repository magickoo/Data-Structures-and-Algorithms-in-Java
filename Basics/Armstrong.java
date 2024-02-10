import java.util.*;
public class Main {
	
	public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        return sum == originalNumber;
    }    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        // Check and display the result
        if (isArmstrong(inputNumber)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        // Close the scanner
        scanner.close();
	}
}
//Time Complecity: O(logn)
