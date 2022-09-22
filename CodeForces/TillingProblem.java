public class TillingProblem {

    public static int TilingProblem(int n) {

        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Choice or Kaam
        int fnm1 = TilingProblem(n - 1);
        int fnm2 = TilingProblem(n - 2);

        int totways = fnm1 + fnm2;
        return totways;
    }

    public static void main(String[] args) {
        System.out.println(TilingProblem(4));
    }
}
