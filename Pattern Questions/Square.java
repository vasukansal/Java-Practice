import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        System.out.print("Enter the no. of rows - ");
        rows = sc.nextInt();
        sc.close();
        pat(rows);
    }

    public static void pat(int rows) {
        for (int i = 1; i <= rows; i++) { // Square
            for (int j = 1; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}