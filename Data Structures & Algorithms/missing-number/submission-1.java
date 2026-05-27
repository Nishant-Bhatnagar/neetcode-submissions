class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int miss = size;
        for(int i = 0; i < size; i++){
            miss ^=  i ^ nums[i];
        }
        
        return miss;
    }
}
