class Solution {
    public int maxOperations(int[] nums, int k) {
        int i=0;
        int j = nums.length-1;
        int count=0;
        Arrays.sort(nums);
        while(i<j){
            if(nums[i]+nums[j]==k) {
                count++;
                i++;
                j--;
            }
            else if(nums[i]+nums[j]>k){
                if(nums[i]>nums[j]){
                    i++;
                }
                else{
                    j--;
                }
            }
            else if(nums[i]+nums[j]<k){
                if(nums[i]<nums[j]){
                    i++;
                }
                else{
                    j--;
                }
            }

        }
        return count;

        
    }
}
