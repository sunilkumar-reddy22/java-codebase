import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = n.nextInt();
        boolean isprime = true;
        if (num <= 1) {
            isprime = false;
        } else {
            for ( int i = 2; i <= num - 1; i++) {
                if (num % i == 0) {
                    isprime = false;
                    break;
                }
            }
        }
        if (isprime) {
            System.out.println("prime number");
        }
        else{
            System.out.println("not a prime number");
        }
    }

}
