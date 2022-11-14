
//Write a program for generating 2 threads, one for printing even numbers and the other for printing odd numbers.
import java.util.Scanner;

class test extends Thread {
    int no;

    public test(int no) {
        this.no = no;
    }

    public void run() {
        for (int i = 0; i < this.no; i++) {
            if (i % 2 == 0) {
                System.out.println("Even - " + i);
            }
        }
    }
}

class test2 extends Thread {
    int no;

    public test2(int no) {
        this.no = no;
    }

    public void run() {
        for (int i = 0; i < this.no; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd - " + i);
            }
        }
    }
}

public class Thread_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Enter the limit - ");
        a = sc.nextInt();
        sc.close();
        Thread even = new Thread(new test(a));
        Thread odd = new Thread(new test2(a));
        even.start();
        odd.start();
    }
}
