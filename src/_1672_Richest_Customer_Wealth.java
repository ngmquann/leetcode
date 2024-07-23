public class _1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > maxWealth) maxWealth = sum;
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(maximumWealth(accounts));
    }
}
