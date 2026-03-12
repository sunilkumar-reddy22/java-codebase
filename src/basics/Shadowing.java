package basics;

public class Shadowing {
   static int x = 40;

    public static void main(String[] args) {
        System.out.println(x);
        x = 80;
        System.out.println(x);
        num();
    }
    static void  num() {
        System.out.println(x);
    }

}
