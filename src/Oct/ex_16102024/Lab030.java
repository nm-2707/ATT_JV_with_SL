package Oct.ex_16102024;

public class Lab030 {
    public static void main(String[] args) {
        // user input via Argument CLI

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);

        // let try ternary operator here
        int age = Integer.parseInt(args[1]);//change args[1] which is a string to integer
        System.out.println(age>25 ? "Allowed to drink" : "Not allowed to drink");

    }
}
