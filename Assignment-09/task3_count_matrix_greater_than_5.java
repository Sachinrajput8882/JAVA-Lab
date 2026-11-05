public class task3_count_matrix_greater_than_5 {
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int count = 0;
        for (int[] row : m)
            for (int x : row) if (x > 5) count++;
        System.out.println("Values greater than 5: " + count);
    }
}
