import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();

        if(number == 0)
            System.out.println("Please enter the non-zero number");
        else {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d  *  %d  =  %d\n", number, i, number * i);
            }
        }
    }
}
