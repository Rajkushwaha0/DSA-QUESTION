class Solution {
    public String reverseVowels(String s) {
        StringBuffer sb = new StringBuffer(s); 
        int i=0;
        int j=s.length()-1;
        while(i<j){
            boolean n = check(sb.charAt(i));
            boolean m = check(sb.charAt(j));
            if(n== true && m== true){
                char ch = sb.charAt(i);
                sb.setCharAt(i,sb.charAt(j));
                sb.setCharAt(j,ch);
                i++;
                j--;
            }
            else if(n== true && m==false){
                j--;
            }
            else if(m== true && n==false){
                i++;
            }
            else{
                i++;
                j--;
            }
        }
        return sb.toString();
        
    }
    public static boolean check(char c){
        int i = c-'a';
        int j = c-'A';
        if(i==0 || i==4 || i==8 || i==14 || i==20 || j==0 || j==4 || j==8 || j==14 || j==20 ) return true;
        return false;

    }
}
