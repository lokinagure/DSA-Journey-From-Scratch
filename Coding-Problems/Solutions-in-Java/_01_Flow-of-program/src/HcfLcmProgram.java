import java.util.Scanner;

public class HcfLcmProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        int firstNumber = input.nextInt();

        System.out.println("Enter the second number");
        int secondNumber = input.nextInt();

        //To find HCF:
        int a = firstNumber;
        int b = secondNumber;

        while (b > 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        int hcf = a;

        // To find lcm:

        int lcm = ( firstNumber * secondNumber ) / hcf;
        System.out.printf("HCF of %d and %d is %d\n", firstNumber, secondNumber, hcf);
        System.out.printf("LCM of %d and %d is %d\n", firstNumber, secondNumber, lcm);
    }
}
