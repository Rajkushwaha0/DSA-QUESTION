class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int ws=0;
        int wsum=0;
        double temp=0;
        double max=Integer.MIN_VALUE;
        for(int we=0;we<nums.length;we++){
            wsum+=nums[we];
            if (we>=k-1){
                temp=(double) wsum/k;
                max=Math.max(max,temp);
                wsum-=nums[ws];
                ws++;
            }
        }
        return max;
    }
}
