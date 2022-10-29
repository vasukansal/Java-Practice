import java.util.Scanner;
import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of Array - ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element at " + i + " index- ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Unsorted Array -" + Arrays.toString(arr));
        Cyclic(arr);
    }

    public static void Cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int temp;
            if (arr[i] != (i + 1)) {
                temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            } else if (arr[i] == (i + 1)) {
                i++;
            }
        }
        System.out.println("Sorted Array - " + Arrays.toString(arr));
    }
}
