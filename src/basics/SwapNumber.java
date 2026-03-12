package basics;

public class SwapNumber {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        //
         swap(a , b);
        System.out.println(a + " " + b);
        String name = "Reddy";
        changename(name);
        System.out.println(name);
    }
    static void changename(String name) {
    name = "Sunil";
    }

    static void swap(int a, int b) {
          int temp = a;
          a = b;
          b = temp;
    }
}
