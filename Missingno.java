//leet code 268. missing number
// https://leetcode.com/problems/missing-number/

import java.util.Scanner;
import java.util.Arrays;

public class Missingno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the array - ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Element at " + i + " index - ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Array - " + Arrays.toString(arr));
        find(arr);
    }

    public static void find(int arr[]) {
        int correct;
        int i = 0;
        int ans = 0;
        ;
        while (i < arr.length) {
            correct = arr[i];
            if ((arr[i] < arr.length) && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                ans = j;
                break;
            } else {
                ans = arr.length;
            }
        }
        System.out.println("Missing no. - " + ans);
    }

    public static void swap(int arr[], int i, int correct) {
        int temp;
        temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
