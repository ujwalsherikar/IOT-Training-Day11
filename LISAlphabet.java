package TrainingDay11;

public class LISAlphabet {
    public static void main(String[] args) {
        String s = "ACBDGH";
        int[] dp = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) < s.charAt(i)) {
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