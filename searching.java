import java.util.Scanner;

public class searching {
    public static void main(String[] args) {
        String str = "VASUKANSAL";
        char target = 'K';
        int range1;
        int range2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        range1 = sc.nextInt();
        range2 = sc.nextInt();
        boolean ans = search(str, target, range1, range2);
        System.out.println(ans);
    }

    static boolean search(String str, char target, int range1, int range2) {
        for (int i = range1; i < range2; i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
