import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the nth term - ");
        n = sc.nextInt();
        sc.close();
        System.out.println("Answer - " + rec(n));

    }

    public static int rec(int n) {
        if (n < 2) {
            return n;
        }
        return rec(n - 1) + rec(n - 2);
    }
}
