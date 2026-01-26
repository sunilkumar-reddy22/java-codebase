package basics;
import java.util.Scanner;
public class PrintNumberx {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner in = new Scanner(System.in);
        //    System.out.println(in);
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");

            int count = 1;
            while (count <= 5) {
             //   System.out.print(count + " ");
                count++;
                int result = (i + count);
                System.out.println(result);
            }
        }
    }
}