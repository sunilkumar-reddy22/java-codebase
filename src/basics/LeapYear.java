package basics;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner leap = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = leap.nextInt();
        if (year % 400 == 0) {
            System.out.println("leap year");
        } else if (year % 100 == 0) {
            System.out.println("not a leap year");
        } else if (year % 4 == 0) {
            System.out.println("leap year");
        }
            else {
            System.out.println("not a leap year");
            }
    }
}


