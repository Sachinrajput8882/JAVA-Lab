public class task2_nested_loop_steps {
    public static void main(String[] args) {
        // Time Complexity: O(n^2)
        int steps = 0;
        for (int i = 1; i <= 10; i++)
            for (int j = 1; j <= 10; j++) steps++;
        System.out.println("Steps: " + steps);
    }
}
