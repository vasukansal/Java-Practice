import java.util.Scanner;

interface Calculator {
    void calc(int a, int b);
}

class Add implements Calculator {
    public void calc(int a, int b) {
        System.out.println("Sum - " + (a + b));
    }
}

class dif implements Calculator {
    public void calc(int a, int b) {
        System.out.println("Diff - " + (a - b));
    }
}

class mul implements Calculator {
    public void calc(int a, int b) {
        System.out.println("Mul - " + (a * b));
    }
}

class div implements Calculator {
    public void calc(int a, int b) {
        System.out.println("Div - " + (a / b));
    }
}

public class InterfaceCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the no.s - ");
        int no1, no2;
        Scanner sc = new Scanner(System.in);
        no1 = sc.nextInt();
        no2 = sc.nextInt();
        System.out.println("Enter the operation - ");
        System.out.println("Addition , Subtraction, Division, Multiplication");
        char op;
        op = sc.next().charAt(0);
        sc.close();
        if (op == 'A') {
            Calculator c1a = new Add();
            c1a.calc(no1, no2);
        } else if (op == 'S') {
            Calculator c1dif = new dif();
            c1dif.calc(no1, no2);
        } else if (op == 'M') {
            Calculator c1mul = new mul();
            c1mul.calc(no1, no2);
        } else if (op == 'D') {
            Calculator c1div = new div();
            c1div.calc(no1, no2);
        }
    }

}
