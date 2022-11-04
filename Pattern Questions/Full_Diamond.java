import java.util.Scanner;

public class Full_Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.close();
        pat(n);
    }

    public static void pat(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int colss = row > n ? 2 * n - row : row;
            int space = n - colss;
            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < colss; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
