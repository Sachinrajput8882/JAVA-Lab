import java.util.Arrays;

public class task2_insertion_sort_second {
    public static void main(String[] args) {
        int[] a = {14, 3, 9, 21, 6};
        for (int i = 1; i < a.length; i++) {
            int key = a[i], j = i - 1;
            while (j >= 0 && a[j] > key) { a[j + 1] = a[j]; j--; }
            a[j + 1] = key;
        }
        System.out.println("Sorted: " + Arrays.toString(a));
    }
}
