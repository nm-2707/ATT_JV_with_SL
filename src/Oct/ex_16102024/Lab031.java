package Oct.ex_16102024;

import java.util.Scanner;

public class Lab031 {
    public static void main(String[] args) {
        // Taking user input via Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age-");
        int age= scanner.nextInt();
        System.out.println(age>25 ? "Allowed to drink" : "Not allowed to drink");

        scanner.close();

            }
}
