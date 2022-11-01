import java.util.Scanner;

public class Star_Inverted_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        System.out.print("ENter the no. of rows - ");
        rows = sc.nextInt();
        sc.close();
        pat(rows);
    }

    public static void pat(int rows) {
        int count = rows;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= count; j++) {
                System.out.print("*");

            }
            count--;
            System.out.println();
        }
    }
}
