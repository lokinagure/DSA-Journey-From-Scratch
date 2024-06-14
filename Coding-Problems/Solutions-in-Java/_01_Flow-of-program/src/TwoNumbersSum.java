import java.util.Scanner;

public class TwoNumbersSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        //Take input of two numbers
        System.out.println("Enter the first number");
        int firstNumber = input.nextInt();

        System.out.println("Enter the second number");
        int secondNumber = input.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.printf("Sum of %d and %d is %d", firstNumber, secondNumber, sum);
    }
}
