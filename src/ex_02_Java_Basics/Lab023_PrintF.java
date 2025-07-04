package ex_02_Java_Basics;

public class Lab023_PrintF {
    public static void main(String[] args) {
        int a =10;
        System.out.println(a);    //ln is for new line

        System.out.println("print command will print without new line");
        System.out.print("Hello");
        System.out.println("add the new line in the end");


        System.out.println(a);
        System.out.printf("your variable name is %d",a);    //10 will be replace by %d


        // %d -> int, byte, long, short,   - data type
        // $s -> String
        // %f -> float, double
        // %b -> boolean


        int b = 20;
        System.out.println("-----------");
        System.out.printf("%d + %d", a,b );

    }
}
