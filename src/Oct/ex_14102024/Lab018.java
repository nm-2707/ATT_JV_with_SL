package Oct.ex_14102024;

public class Lab018 {
    public static void main(String[] args) {
        // nested ternary
        int a=171, b=91, c=31;
        String max = (a>=b && a>=c) ? "a is max" : (b>=a && b>=c) ? "b is max" : "c is max";
        System.out.println(max);
    }
}
