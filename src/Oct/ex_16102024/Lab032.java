package Oct.ex_16102024;

import java.util.Scanner;

public class Lab032 {
    public static void main(String[] args) {
        // user input via scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age= scanner.nextInt();

        System.out.println("Enter your salary");
        int sal = scanner.nextInt();

        System.out.println("Enter your name");
        String name = scanner.next(); // .next() discard anything after white space means it will print only firstname

        // System.out.printf("My name is %s and my salary is %d and age is %d",name,sal,age);
        System.out.println("My name is "+ name +", my age is " +age +" and my salary is " +sal);
        System.out.println("My age is "+ name);

        scanner.close();

    }
}
