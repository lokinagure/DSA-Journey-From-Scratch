import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year to check for Leap year");
        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0)
            || year % 400 == 0){
            System.out.printf("Year %d is a Leap Year", year);
        } else
            System.out.printf("Year %d is not a Leap Year", year);
    }
}
