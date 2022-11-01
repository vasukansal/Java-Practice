import java.util.Scanner;

public class Number_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        System.out.print("Enter the no. of rows - ");
        rows = sc.nextInt();
        sc.close();
        pat(rows);
    }

    public static void pat(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
