import java.util.Scanner;
import java.util.Arrays;

public class Floor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of array ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Current Array - ");
        System.out.println(Arrays.toString(arr));
        sort(arr);
        int target;
        System.out.print("Enter the target element - ");
        target = sc.nextInt();
        sc.close();
        int ans = fv(arr, target);
        System.out.print("Result - ");
        System.out.println(ans);
    }

    // Function for sorting array
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (temp > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.print("Sorted array - ");
        System.out.println(Arrays.toString(arr));
    }

    static int fv(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return arr.length - 1;
        }
        int middle;
        int start = 0;
        int end = arr.length;
        while (start <= end) {
            middle = start + ((end - start) / 2);
            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else if (target == arr[middle]) {
                return middle + 1;
            }
        }
        return end;
    }
}
