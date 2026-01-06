package basics;

public class TypePromotion {
    public static void main(String[] args) {
        int x = 50000;
        int n = 'A';
        byte b = 100;
        char c = 'a';
        float f = 6453.23f;
        double d = 7373298.2345;
        double result = (x * n) + (b / c) - (f -d);
        System.out.println(( x * n) + " " + (b / c) + " " + (f - d));
        System.out.println(result);


    }
}
