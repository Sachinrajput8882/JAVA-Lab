public class task2_sum_and_largest {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 33, 21};
        int sum = 0, largest = arr[0];
        for (int x : arr) {
            sum += x;
            if (x > largest) largest = x;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Largest: " + largest);
    }
}
