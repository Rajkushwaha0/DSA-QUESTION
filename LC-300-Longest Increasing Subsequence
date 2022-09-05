class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] memo = new int [nums.length];
        int ans=0;
        for (int i=0;i<nums.length;i++){
            int max=0;
            for(int j=0;j<=i;j++){
                if(nums[i]>nums[j] && memo[j]>max){
                    max=memo[j];
                }
                
            }
            memo[i]=max+1;
            ans=Math.max(ans,memo[i]);
        }
        return ans;
    }
}
