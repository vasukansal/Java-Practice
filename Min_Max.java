import java.util.Scanner;
import java.io.*;

public class Min_Max {
    public static int getmin(int arr[]) {
        int small = arr[0];
        for (int i = 0; i < arr.length; i++) {
            small = Math.min(small, arr[i]);
        }
        return small;
    }

    public static int getmax(int arr[]) {
        int great = arr[0];
        for (int i = 0; i < arr.length; i++) {
            great = Math.max(great, arr[i]);
        }
        return great;
    }

    public static void MinMax(int arr[]) {
        int minsum = 0;
        int maxsum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == getmax(arr)) {
                continue;
            } else {
                minsum = minsum + arr[i];
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == getmin(arr)) {
                continue;
            } else {
                maxsum = maxsum + arr[j];
            }
        }
        System.out.println(minsum + " " + maxsum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter the size of the array - ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        MinMax(arr);
    }
}
