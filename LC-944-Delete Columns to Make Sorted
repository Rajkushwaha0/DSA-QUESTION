class Solution {
    public int minDeletionSize(String[] strs) {
        int n=strs.length;
        int ans=0;
        int i=0;
        int m=strs[0].length();
        while(i<m){
            int max=0;
            int count=0;
            for(int j=0;j<strs.length;j++){
                char ch=strs[j].charAt(i);
                count=(int)ch-'a';
                if(count<max){
                    ans++; 
                    break;
                }
                max=count;
            }
            i++;
        }
        return ans;
    }
}
