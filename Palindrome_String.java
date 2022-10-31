import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Enter the String to check - ");
        s = sc.nextLine();
        sc.close();
        Check(s);
    }

    public static void Check(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        String reverse = sb.toString();
        if (s.length() == 0 || s == null || reverse.equals(s)) { // Empty String is also palindrome
            System.out.println("Yes, This is String Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
