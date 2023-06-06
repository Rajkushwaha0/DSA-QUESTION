class Solution {
    public String replaceDigits(String s) {
        char ch = s.charAt(0);
        String ans = "";
        ans+=ch; 
        for(int i=1;i<s.length();i++){
            ch = s.charAt(i);
            if(Character.isDigit(ch)){
                char ch1 = s.charAt(i-1);
                int n = (int) ch1;
                n+= ch-'0';
                ch = (char) n;
            }
            ans+=ch;
             

        }
        
        return ans;
    }
}
