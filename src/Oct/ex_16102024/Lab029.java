package Oct.ex_16102024;

public class Lab029 {
    public static void main(String[] args) {
        // max of 3 numbers using ternanry operator
        int a=310;
        int b=221;
        int c = 34;
        String max = (a>=b && a>=c) ? "a is max":b>c ? "b is max": "c is max";
        System.out.printf(max);
    }
}
