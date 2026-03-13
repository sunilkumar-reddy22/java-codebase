package basics;
import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
        fun(1,4,5,6,76);
    }
    static void fun(int ...a) {
        System.out.println(Arrays.toString(a));
    }

}
