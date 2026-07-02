class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int Totalmaxprofit = 0;
        int min = Integer.MAX_VALUE;

        int lefval = 0;
        int leftside[] = new int[n];

        for (int i = 0; i <= n-1; i += 1) {

            if (prices[i] < min) {
                min = prices[i];
            }
            lefval = Math.max(lefval, prices[i] - min);
            leftside[i] = lefval;
        }
        int rightval = 0;

        int max = Integer.MIN_VALUE;

        int rightside[] = new int [n];

        for (int i = n-1; i >= 0; i--) {

            if (prices[i] > max) {
                max = prices[i];
            }
            rightval = Math.max(rightval, max - prices[i]);
            rightside[i] = rightval;
        }

        for (int i = 0; i <= n-1; i += 1) {

            Totalmaxprofit = Math.max (Totalmaxprofit,leftside[i] + rightside[i]);
        }
        return Totalmaxprofit;
    }
}