public class task2_permutation_nPr {
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }
    static int nPr(int n, int r) {
        return fact(n) / fact(n - r);
    }
    public static void main(String[] args) {
        System.out.println("5P2 = " + nPr(5, 2));
    }
}
