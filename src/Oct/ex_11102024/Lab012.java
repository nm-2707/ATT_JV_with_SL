package Oct.ex_11102024;

public class Lab012 {
    public static void main(String[] args) {
        int a =10;
        int b = 20;
        String name1 = "Nitish";
        String name2 = "Mani";

        System.out.println(name1+name2);
        System.out.println(name1+name2+a+b);// first concatination
        System.out.println(name1+name2+(a+b));
        System.out.println(a+b+name1+name2); // first arthmetic addition operation

        // it is a example of operator overloading. the addition operator behaves differently with different data types

    }
}
