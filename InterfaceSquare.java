//Write a program to create interface named test. 
//In this interface the member function is square.
//Implement this interface in arithmetic class. 
//Create one new class called ToTestInt. In this class usethe object of arithmetic class

package practice;

import java.util.Scanner;

interface test {
    int square(int a);
}

class Arthimetic implements test {
    public int square(int a) {
        return a * a;
    }
}

public class InterfaceSquare {
    public static void main(String[] args) {
        System.out.print("Enter the no. - ");
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        Arthimetic a1 = new Arthimetic();
        int ans;
        ans = a1.square(a);
        System.out.println("Square - " + ans);
    }

}
