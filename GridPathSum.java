package TrainingDay11;

public class GridPathSum {
    public static void main(String[] args) {
        int[][] a = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };
        for (int i = 1; i < a.length; i++)
            a[i][0] += a[i - 1][0];
        for (int j = 1; j < a[0].length; j++)
            a[0][j] += a[0][j - 1];
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a[0].length; j++) {
                a[i][j] += Math.min(a[i - 1][j], a[i][j - 1]);
            }
        }
        System.out.println("Minimum Path Sum = " + a[2][2]);
    }
}