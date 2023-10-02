class Solution {
    public boolean winnerOfGame(String s) {
        int a =0;
        int b =0;
        int i=1;
        int n=s.length();
        while(i<n-1){
            if(s.charAt(i-1)==s.charAt(i) && s.charAt(i+1)==s.charAt(i)){
                if(s.charAt(i)=='A') a+=1;
                else b+=1;
            }
            i++;
        }
        if(a>b) return true;
        return false;

        
    }
}


