
//Finding Time Complexity of Binary Search 
import java.util.Scanner;
import java.lang.Math;

public class BSTimeComplex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; // Total no. of array elements
        System.out.print("Enter the total no. of array elements - "); // Taking total no. of array elements as input
        n = sc.nextInt();
        sc.close();
        System.out.println("Time complexity - ");
        calculate(n);
    }

    // Function for applying formulae of finding time complexity
    public static void calculate(int n) {
        System.out.println(Math.log(n) / Math.log(2));
    }
}