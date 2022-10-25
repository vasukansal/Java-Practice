import java.util.Scanner;
import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of Array - ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element at " + i + " index - ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Unsorted Arrays - " + Arrays.toString(arr));
        Insertion(arr);
    }

    public static void Insertion(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] < arr[j]) {
                    break;
                } else if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array - " + Arrays.toString(arr));
    }
}