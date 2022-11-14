class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length()-1;
        int ans=0;
        while(n != -1){
            char ch=s.charAt(n);
            if(ch != ' ') {
                ans++;
                n--;
            }
            else {
                if(ans>0) {
                    n = -1;
                    continue;
                }
                n--;
            }
        }
        return ans;
    }
}
