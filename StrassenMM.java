package practice;

import java.util.Scanner;

public class StrassenMM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arrA = new int[2][2]; // declaring 1st array
        int[][] arrB = new int[2][2]; // declaring 2nd array
        System.out.println("Enter the elements in Array A - ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arrA[i][j] = sc.nextInt(); // takin input in 1st array
            }
        }
        System.out.println("Enter the elements in Array B - ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arrB[i][j] = sc.nextInt(); // taking input in 2nd array
            }
        }
        sc.close();
        int[][] arrC = new int[2][2]; // declaring result array
        arrC = Calculation(arrA, arrB);
        for (int i = 0; i < 2; i++) { // printing result array
            System.out.print("[ ");
            for (int j = 0; j < 2; j++) {
                System.out.print(arrC[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    // Function for Strassen Multiplication Calculation
    public static int[][] Calculation(int[][] arrA, int[][] arrB) {
        int P, Q, R, S, T, U, V;
        P = (arrA[0][0] + arrA[1][1]) * (arrB[0][0] + arrB[1][1]);
        Q = arrB[0][0] * (arrA[1][0] + arrA[1][1]);
        R = arrA[0][0] * (arrB[0][1] - arrB[1][1]);
        S = arrA[1][1] * (arrB[1][0] - arrB[0][0]);
        T = arrB[1][1] * (arrA[0][0] + arrA[0][1]);
        U = (arrB[0][0] + arrB[0][1]) * (arrA[1][0] - arrA[0][0]);
        V = (arrB[1][0] + arrB[1][1]) * (arrA[0][1] - arrA[1][1]);

        int[][] arrC = new int[2][2];
        arrC[0][0] = P + S - T + V;
        arrC[0][1] = R + T;
        arrC[1][0] = Q + S;
        arrC[1][1] = P + R - Q + U;
        return arrC;
    }
}
