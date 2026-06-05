class Solution {
    public int trap(int[] height) {
        int sum = 0;
        int[] rightMax = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for(int i = height.length - 2; i >= 0; i--){    
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
            
        }
        int max = height[0];
        for(int i = 1; i < height.length - 1; i++){   
            max = Math.max(max, height[i]); 
            sum += Math.min(max, rightMax[i]) - height[i];
            
        }
        return sum;
    }
}
