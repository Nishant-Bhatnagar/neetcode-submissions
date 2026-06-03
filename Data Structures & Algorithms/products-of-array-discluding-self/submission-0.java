class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] rightProd = new int[size];
        int[] result = new int[size];
        rightProd[size - 1] = nums[size - 1];
        for(int i = size - 2; i >= 0; i--){
            int curr = nums[i];
            rightProd[i] = curr * rightProd[i + 1];
            //System.out.print(rightProd[i]);
        }
        int left = 1;
        for(int i = 0; i < size - 1; i++){
            int rightVal = rightProd[i + 1] * left;
            result[i] = rightVal;
            left = left * nums[i];
        }
        result[size - 1] = left;
        return result;
        
    }
}  
