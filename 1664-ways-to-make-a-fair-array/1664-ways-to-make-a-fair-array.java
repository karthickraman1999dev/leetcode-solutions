class Solution {
    public int waysToMakeFair(int[] nums) {
        int n = nums.length;
        int total_even = 0;
        int total_odd = 0;
        // step 1 calculate total sum of even index element and odd index element;

        for (int i = 0; i < n; i+=1) {
            if (i % 2 == 0) {
                total_even += nums[i];
            } else {
                total_odd += nums[i];
            }
        }
        int cnt = 0;
        int prf_even = 0;
        int prf_odd = 0;
        // step 2  remove all index element one by one;
        for (int i = 0; i < n; i+=1) {
            int suff_even = 0;
            int suff_odd = 0;

            if (i % 2 == 0) {
                // case 1 remove even index element;
                suff_even = total_odd - prf_odd;
                suff_odd = total_even - (prf_even + nums[i]);
            } else {
                // case 2 remove odd index element;
                suff_even = total_odd - (prf_odd + nums[i]);
                suff_odd = total_even - prf_even;
            }
            int cur_even = prf_even + suff_even;
            int cur_odd = prf_odd + suff_odd;

            if (cur_even == cur_odd) {
                cnt++;
            }

            if (i % 2 == 0) {
                prf_even += nums[i];
            } else {
                prf_odd += nums[i];
            }
        }
        return cnt;
    }
}
