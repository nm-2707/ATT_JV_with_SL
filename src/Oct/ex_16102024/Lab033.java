package Oct.ex_16102024;

public class Lab033 {
    public static void main(String[] args) {
        // Taking input via Argumnet and find max of 2 numbers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int max = num1>num2 ? num1:num2;
        System.out.println("The largest number is:" + max );
    }
}
