class Solution {
    public int minSubArrayLen(int target, int[] nums) {  
        int ws=0;
        int wsum=0;
        int maxlength=Integer.MAX_VALUE;
        for(int we=0;we<nums.length;we++){
            wsum+=nums[we];
            while(wsum>=target){
                maxlength=Math.min(maxlength,we-ws+1);
                wsum-=nums[ws];
                ws++;
            }
        }
        if(maxlength==Integer.MAX_VALUE)
            return 0;
        return maxlength;
    }
}
