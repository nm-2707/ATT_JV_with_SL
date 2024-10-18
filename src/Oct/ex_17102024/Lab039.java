package Oct.ex_17102024;

import java.util.Scanner;

public class Lab039 {
    public static void main(String[] args) {
        // two or more output
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1");
        int num1 = sc.nextInt();

        System.out.println("Enter number2");
        int num2 = sc.nextInt();

        if (num1>num2) {
            System.out.println("Num1 is greater");
        }
        else if (num2>num1) {
            System.out.println("Num2 is greater");
        }
        else {
            System.out.println("Both numbers are equal");
        }
        sc.close();
    }
}
