public class Backpack {
    public static void main(String[] args) {
        int backpackSize = 10;
        int n = 5;

        String[] itemNames = { "poster", "lamp", "skis", "surfboard", "guitar" };
        int[] itemWeights = { 2, 4, 5, 8, 10 };
        int[] itemValues = { 40, 70, 60, 70, 120 };

        int[][] dp = new int[n + 1][backpackSize + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= backpackSize; j++) {
                if (itemWeights[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - itemWeights[i - 1]] + itemValues[i - 1]);
                }
            }
        }

        System.out.println("Maximum value that can be stolen: " + dp[n][backpackSize]);
    }
}