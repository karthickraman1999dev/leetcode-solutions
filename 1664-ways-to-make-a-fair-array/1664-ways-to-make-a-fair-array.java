class Solution {
    public int waysToMakeFair(int[] nums) {
        int n = nums.length;

        int pfe[] = new int [n];
        int pfo[] = new int [n];
        
        pfe[0] = nums[0];
        pfo[0] = 0;

        for (int i = 1; i < n;++i) {
            if (i % 2 == 0) {
                pfe[i] = pfe[i-1] + nums[i];
                pfo[i] = pfo[i-1];
            } else {
                pfo[i] = pfo[i-1] + nums[i];
                pfe[i] = pfe[i-1];
            }
        }

        int se = 0;
        int so = 0;
        int c = 0;

        for (int i = 0; i < n;++i) {
            if (i == 0) {
                se = pfo[n-1] - pfo[i];
                so = pfe[n-1] - pfe[i];
            } else {
                se = pfe[i-1] + (pfo[n-1] - pfo[i]);
                so = pfo[i-1] + (pfe[n-1] - pfe[i]);
            }

            if (se == so) {
                c++;
            }
        }
        return c;
    }
}