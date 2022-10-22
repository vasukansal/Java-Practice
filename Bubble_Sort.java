import java.util.Scanner;
import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the array - ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element at " + i + " index - ");
            arr[i] = sc.nextInt();

        }
        System.out.println("Unsorted Array - " + Arrays.toString(arr));
        bubble(arr);

    }

    public static void bubble(int[] arr) {
        int i = 0;

        while (i != arr.length) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp;
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
            i++;
        }

        System.out.println("Sorted array - " + Arrays.toString(arr));

    }
}
