package Oct.ex_17102024;

import java.util.Scanner;

public class Lab038 {
    public static void main(String[] args) {
        //create a program - tale user imput
        //check whether the input is even or odd

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("Entered number is even " + num);
        }
        else {
            System.out.println("Entered number is odd " + num);
        }
        sc.close();

    }
}
