package TrainingDay11;

public class LIS {
    public static void main(String[] args) {
        int[] a = {10, 22, 9, 33, 21, 50, 41, 60};
        int[] dp = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int max = 0;
        for (int x : dp) {
            max = Math.max(max, x);
        }
        System.out.println("LIS Length = " + max);
    }
}