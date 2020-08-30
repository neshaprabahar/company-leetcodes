class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        output[0] = 1;
        for (int i = 1; i < nums.length; ++i) output[i] = output[i-1] * nums[i-1];

        int rprod = 1;
        for (int i = nums.length - 2; i >= 0; --i) {
            rprod *= nums[i+1];
            output[i] *= rprod;
        }

        return output;

    }
}