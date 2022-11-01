import java.util.Scanner;

public class Half_Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        System.out.print("Enter the no. of rows - ");
        rows = sc.nextInt();
        sc.close();
        pat(rows);
    }

    public static void pat(int row) {
        for (int i = 1; i <= ((row + 1) / 2); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int count = (row + 1) / 2;
        for (int i = 1; i <= (((row + 1) / 2) - 1); i++) {
            for (int j = 1; j < count; j++) {
                System.out.print("*");
            }
            count--;
            System.out.println();
        }
    }
}
