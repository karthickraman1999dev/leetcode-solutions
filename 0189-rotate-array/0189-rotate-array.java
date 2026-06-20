class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    } 
    private static void reverse(int[] nums, int L, int R) {

        while (L < R) {

            int temp = nums[L];
            nums[L] = nums[R];
            nums[R] = temp;
            L++;
            R--;
        }
    }
}