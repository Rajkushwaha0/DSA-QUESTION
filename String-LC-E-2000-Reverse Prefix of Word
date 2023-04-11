class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder(word);
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(ch==c) {
                return solve(sb,i);
            }
        }
        return word;
        
    }
    public String solve(StringBuilder sb,int in){
        int i=0;
        while(i<=in){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(in));
            sb.setCharAt(in,temp);
            i++;
            in--;
        }
        return sb.toString();
    }
}
