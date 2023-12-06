class Solution {
    public int totalMoney(int n) {
        int[] ans = new int[7];
        int i=0;
        int m=7;
        int sum=0;
        while(n!=0){
            i=i%m;
            if(i==0){
                ans[i]=ans[i]+1;
            }
            else{
                ans[i]=ans[i-1]+1;
            }
            sum+=ans[i];
            i++;
            n--;
        }
        return sum;
    }
}
