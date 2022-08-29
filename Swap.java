import java.util.Scanner;
import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 elements in array");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the indexes, you want to swap ");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        swap(arr, a, b);
        System.out.print(Arrays.toString(arr));
    }

    static void swap(int[] arr, int a, int b) {
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}