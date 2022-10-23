import java.util.Scanner;
import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the array - ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("ENter the element at " + i + " index - ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Unsorted Array - " + Arrays.toString(arr));
        Selection(arr);
    }

    public static void Selection(int[] arr) {
        int temp;
        int JJ;
        for (int i = 0; i < arr.length; i++) {
            temp = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[temp]) {
                    temp = j;
                }
            }
            JJ = arr[temp];
            arr[temp] = arr[i];
            arr[i] = JJ;
        }
        System.out.println("Sorted Array - " + Arrays.toString(arr));
    }
}