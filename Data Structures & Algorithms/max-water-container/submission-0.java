class Solution {
    public int maxArea(int[] heights) {
        int size = heights.length - 1;
        int s = 0, end = size;
        int mostWater = Integer.MIN_VALUE;
        while(s < end){
            mostWater = Math.max(mostWater, (end - s) * Math.min(heights[s], heights[end]));
            if(heights[s] <= heights[end]) s++;
            else end--;
        }
        return mostWater;
    }
}
