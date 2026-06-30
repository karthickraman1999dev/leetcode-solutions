class Solution {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;

        int product1 = 0;

        int product2 = 0;

        product1 = nums[n-1] * nums[n-2] * nums[n-3];
        product2 = nums[0] * nums[1] * nums[n-1];

        return Math.max(product1,product2);

    }
}