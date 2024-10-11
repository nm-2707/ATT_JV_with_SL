package Oct.ex_11102024;

public class Lab008 {
    int i_age; // instance variable
    static int s_age; // static variable

    public static void main(String[] args) {
        int age;
        age=27;
        System.out.println(age);
        System.out.println(s_age); //It will give the dfault value
        //System.out.println(i_age);- Instance variable cannot be accessed directly from Static method (main method).
    }

}
