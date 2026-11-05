public class task3_bubble_sort_swaps {
    public static void main(String[] args) {
        int[] a = {5, 1, 4, 2, 8};
        int swaps = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j]; a[j] = a[j + 1]; a[j + 1] = t;
                    swaps++;
                }
            }
        }
        System.out.println("Swaps: " + swaps);
    }
}
