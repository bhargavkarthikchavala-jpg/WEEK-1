import java.util.Scanner;
class Palindrome2 {
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int originalNumber = number;
        int reversedNumber = 0;
        for (int temp = number; temp > 0; temp /= 10) 
	{
            int lastDigit = temp % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }

        scanner.close();
    }
}