//Q. Write a program to create interface A, in this interface 
//we have two method meth1 and meth2.Implements this interface in another class 
package practice;
import java.util.Scanner;

interface A {
    int meth1(int a, int b);

    int meth2(int a, int b);
}

class Myclass {
    public int meth1(int a, int b) {
        return a / b;
    }

    public int meth2(int a, int b) {
        return a % b;
    }
}

public class InterfacePractice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the no.s");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        Myclass mc = new Myclass();
        int c, d;
        System.out.print("Quotient - ");
        c = mc.meth1(a, b);
        System.out.println(c);
        System.out.print("Remainder - ");
        d = mc.meth2(a, b);
        System.out.println(d);
    }
}
