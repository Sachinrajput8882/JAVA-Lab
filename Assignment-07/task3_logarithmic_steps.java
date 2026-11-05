public class task3_logarithmic_steps {
    public static void main(String[] args) {
        // Time Complexity: O(log n)
        int n = 1024, steps = 0;
        while (n > 1) { n /= 2; steps++; }
        System.out.println("Halving steps: " + steps);
    }
}
