package Oct.ex_17102024;

import java.util.Scanner;

public class Lab034 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Allowed to vote");
        }
        else {
            System.out.println("Not allowed to vote");
        }


    }
}
