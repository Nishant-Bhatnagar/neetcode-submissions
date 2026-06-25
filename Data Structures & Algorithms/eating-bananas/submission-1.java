class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = Integer.MIN_VALUE;
        int ans = 0;
        for(int i = 0; i < piles.length; i++){
            r = Math.max(r, piles[i]);
        }
        //System.out.print("low >" + l + " high >" + r);
        while(l <= r){
            int m = (l + r)/ 2;
            //System.out.print("mid> "+ m + " ");
            if(check(piles, m, h)){
                r = m - 1;
                ans = m;
            }
            else {l = m + 1;}
        }
        return ans;
    }
    public boolean check(int[] piles, int m, int h){
        int eatHour = 0;
        for(int i = 0; i < piles.length; i++){
            eatHour += piles[i]/m;
            if(piles[i] % m != 0) eatHour++;
        }
        //System.out.print("hours>" + eatHour + " ");
        return eatHour <= h;
    }
}
