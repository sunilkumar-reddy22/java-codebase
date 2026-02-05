package basics;
import java.util.Scanner;
public class UserTable {
    public static void main(String[] args) {
        System.out.println("enter a integer: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(num + "x " + i + " = " + (num * i));
        }

   }
}
