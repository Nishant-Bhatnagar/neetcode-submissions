class Solution {
    public boolean isAnagram(String s, String t) {
        int ch[] = new int[26];
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            ch[c - 'a'] ++;
        }
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            ch[c - 'a'] --;
        }
        for(int i: ch){
            if(i != 0) return false;
        }
        return true;
    }
}
