class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int miss = 0;
        for(int i = 0; i < size; i++){
            miss ^= nums[i];
        }
        for(int i = 0; i <= size; i++){
            miss ^= i;
        }
        return miss;
    }
}
