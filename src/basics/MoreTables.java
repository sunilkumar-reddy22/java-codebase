package basics;

public class MoreTables {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println("\n Table of " + i);
            for (int k = 1; k <= 10; k++) {
                System.out.println(i + " x " + k + " = " + (i * k));
            }
        }
    }
}