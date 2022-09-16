// Get the greater alphabat from the array than the one which is input and if it is
//the gratest as compared to array then pront the first indexed element of array

package practice;

import java.util.Scanner;
import java.util.Arrays;

public class greateralphabet {
    public static char nextGreatestLetter(char[] arr, char target) {
        int[] arrint = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrint[i] = (int) arr[i];
        }
        sort(arrint);
        int targetint = (int) target;
        char anschar;
        if (target > arrint[arrint.length - 1]) {
            anschar = (char) arrint[0];
            return anschar;
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
            }
        }
        anschar = (char) arr[start];
        return anschar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array - ");
        int size;
        size = sc.nextInt();

        char[] letters = new char[size];
        letters = sc.next().toCharArray();
        System.out.println(Arrays.toString(letters));

        char target;
        System.out.print("Enter the target - ");
        target = sc.next().charAt(0);

        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);

    }

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
    }
}