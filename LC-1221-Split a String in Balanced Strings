class Solution {
    public int balancedStringSplit(String s) {
        int c = 0,ans = 0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch == 'R') c++;
            if(ch == 'L') c--;
            if(c == 0) ans++;
        }
        return ans;
    }
}
