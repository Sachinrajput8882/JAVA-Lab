public class task1_combination_nCr {
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }
    static int nCr(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }
    public static void main(String[] args) {
        System.out.println("5C2 = " + nCr(5, 2));
    }
}
