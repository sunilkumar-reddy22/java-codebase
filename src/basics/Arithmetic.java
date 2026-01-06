package basics;

import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Add = " + (a + b));
        System.out.println("Sub = " + (a - b));
        System.out.println("Mul = " + (a * b));
        System.out.println("Div =" + (float)a/b);
        System.out.println("Mod = " + (a % b));


    }
}
