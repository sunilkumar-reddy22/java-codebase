package basics;
import java.util.Scanner;
public class AverageofNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int average = (a + b) / 2;
        System.out.println("average:" + average);
    }
}
