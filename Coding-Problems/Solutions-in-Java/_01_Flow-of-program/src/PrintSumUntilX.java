import java.util.Scanner;

public class PrintSumUntilX {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true){
            System.out.print("Enter a number (or 'x' to stop): ");

            String s1 = input.nextLine();

            if (s1.equalsIgnoreCase("x")) {
                break;
            }

            try {
                int number = Integer.parseInt(s1);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'x' to stop.");
            }
        }
        System.out.printf("Sum is : %d", sum);
        input.close();

    }

}

