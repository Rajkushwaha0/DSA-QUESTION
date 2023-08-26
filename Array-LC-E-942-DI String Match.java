class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int d= n;
        int j = 0;
        int[] ans = new int[d+1];
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='I'){
                ans[i]=j;
                j++;
            }
            else{
                ans[i]=d;
                d--;
            }
        }
        if(s.charAt(n-1)=='D') ans[n]=ans[n-1]-1;
        else ans[n]=ans[n-1]+1;
        return ans;

        
    }
}
