class Solution {
    public boolean canJump(int[] nums) {
        int size = nums.length;
        int checkIndex = size - 1;
        for(int i = size - 2; i >= 0; i--){
            if(nums[i] + i >= checkIndex){
                checkIndex = i;
            }
        }

        return checkIndex == 0 ? true : false;
    }
}
