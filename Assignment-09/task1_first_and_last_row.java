public class task1_first_and_last_row {
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.print("First row: ");
        for (int x : m[0]) System.out.print(x + " ");
        System.out.println();
        System.out.print("Last row: ");
        for (int x : m[2]) System.out.print(x + " ");
    }
}
