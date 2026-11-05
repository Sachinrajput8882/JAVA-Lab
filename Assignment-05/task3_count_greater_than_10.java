public class task3_count_greater_than_10 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 2, 14, 7};
        int count = 0;
        for (int x : arr) if (x > 10) count++;
        System.out.println("Count greater than 10: " + count);
    }
}
