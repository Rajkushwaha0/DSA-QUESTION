class Solution {
    public String reverseWords(String s1){
        StringBuilder ans = new StringBuilder();
        StringBuilder f = new StringBuilder();
        int n=s1.length()-1;
        while(n >= -1){ 
            if(n> -1){
                char ch = s1.charAt(n);
                if(ch!= ' ' && n>=0){
                    f.append(ch);
                    n--; 
                }
                else if( ch==' ' && n >= 0){
                    f.reverse();
                    ans.append(f);
                    if(n>-1) ans.append(' ');
                    while((n > -1) && s1.charAt(n)==' ' && s1.charAt(n-1)==' ') n--;
                    f.delete(0,f.length());
                    n--;
                }
            }
            else{
                    if(n< 0){
                    f.reverse();
                    ans.append(f);
                    n--;
                }
            }
            
        }
        return ans.toString();
    }
} 
