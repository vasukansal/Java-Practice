import java.util.Scanner;

public class SearchFirstLastIndex {
    public static void main(String[] args) {
        find();
    }

    public static void find() {
        Scanner sc = new Scanner(System.in);
        String st;
        String ser;
        System.out.print("Enter the string you want to search - ");
        st = sc.nextLine();
        System.out.print("Enter the cahracter or substring you want to search - ");
        ser = sc.nextLine();
        sc.close();
        if (st.indexOf(ser) == -1 || st.lastIndexOf(ser) == -1) {
            System.out.println("Entered substring does not exist ");
        } else if (st.indexOf(ser) == st.lastIndexOf(ser)) {
            System.out.println("There is only 1 occurance of it and its index is - " + st.indexOf(ser));
        } else {
            System.out.println("First occurance index of " + ser + " is - " + st.indexOf(ser));
            System.out.println("Last occurance index of " + ser + " is - " + st.lastIndexOf(ser));
        }

    }
}