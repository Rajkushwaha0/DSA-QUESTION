class Solution {
    public String largestOddNumber(String num) {
        int j=num.length()-1;
        char ch = num.charAt(j);
        int m = ch-'0';
        if(m%2==1) return num;
        while(j>=0){
            char ch1=num.charAt(j);
            long a = ch1-'0';
            if(a%2==1){
                String s = num.substring(0,j+1);
                return s;
            }
            j--;
        }
        

        return "";

        
    }
}
