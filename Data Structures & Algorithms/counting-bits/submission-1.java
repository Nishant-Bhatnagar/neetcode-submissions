class Solution {
    public int[] countBits(int n) {
        int result[] = new int[n + 1];
        for(int j = 0; j <= n; j++){
            int count = 0;
               for(int i = 0; i < 32; i++){
                    if((j >> i & 1) == 1) count++;
                } 
                result[j] = count;
            }
            return result;
        
    }
}
