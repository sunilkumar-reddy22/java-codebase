package basics;
import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        System.out.println("enter a char: ");
        Scanner letter  = new Scanner(System.in);
        char ch = letter.next().trim().charAt(0);
        System.out.println(ch);
        String word = "hello";
        System.out.println(word.charAt(3));

    }
}
