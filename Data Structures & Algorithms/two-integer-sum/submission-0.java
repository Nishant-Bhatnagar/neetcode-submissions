class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> fre = new HashMap<>();
        int result[] = new int[2];
        for(int i = 0; i < nums.length; i++){
            fre.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            int find = target - nums[i];
            if(fre.containsKey(find) && fre.get(find) != i){
                result[0] = Math.min(i, fre.get(find));
                result[1] = Math.max(i, fre.get(find));
            }
        }
        return result;
    }
}
