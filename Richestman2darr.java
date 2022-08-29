public class Richestman2darr {
    public static void main(String[] args) {
        int[][] arr = { { 100, 2 }, { 202, 3 }, { 333, 5 } };
        int index = rich(arr);
        System.out.println(index + 1);
    }

    static int rich(int[][] arr) {
        int max = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                max = max + arr[i][j];
            }
        }
        int sum = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            if (sum > max) {
                max = sum;
                index = i;
            }
        }
        return index;
    }
}
