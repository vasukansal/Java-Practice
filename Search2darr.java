public class Search2darr {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int target = 55;
        boolean ans = search(arr, target);
        System.out.println(ans);
    }

    static boolean search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
