import java.util.Scanner;

public class Star_Triangle {
    public static void main(String[] args) { // Star Triangle pattern
        Scanner sc = new Scanner(System.in);
        int row;
        System.out.print("Enter the no. of Rows - ");
        row = sc.nextInt();
        sc.close();
        pat(row);
    }

    public static void pat(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
