class Solution {
    public boolean isPalindrome(String s) {
        String t = "";
       for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z' ) || (ch >= '0' && ch <= '9')){
                t += ch;
            }
       } 
       int st = 0, e = t.length() - 1;
       while(st <= e){
        char ch1 = Character.toLowerCase(t.charAt(st));
        char ch2 = Character.toLowerCase(t.charAt(e));
        if(ch1 != ch2) return false;
        st++;
        e--;

       }
       return true;
    }
}
