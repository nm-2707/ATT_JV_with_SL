package Oct.ex_14102024;

public class Lab019 {
    public static void main(String[] args) {
        //nested ternary operator
        int marks = 38;
        String grade = marks>=90 ? "A+" : marks>=80 ? "A" : marks>=70 ? "B+" : marks>=60 ? "B" : marks>=50 ? "C" : marks>=40 ? "D" : "Fail";
        System.out.printf("Your grade is %s",grade);
    }
}
