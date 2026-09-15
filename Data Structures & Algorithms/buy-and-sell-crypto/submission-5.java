class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = 101;
        int curMon = 0;
        int i = 0;
        for (int j = 0; j < prices.length; j++) {
            if (prices[j] <= min) {
                if (max - min > curMon) {
                    curMon = max - min;
                }
                min = prices[j];
                max = 0;
                continue;
            }
            if (prices[j] >= max) {
                max = prices[j];
                if (max - min > curMon) {
                    curMon = max - min;
                }
                continue;
            }
            
        }
        return curMon;
    }
}
