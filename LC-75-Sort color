class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int s=0;
        int e=nums.length-1;
        while(i<=e){
            int temp=0,temp1=0;
            if(nums[i]==1){
                i++;
            }
            else if(nums[i]==0){
                temp=nums[i];
                nums[i]=nums[s];
                nums[s]=temp;
                i++;
                s++;
            }
            else{
                temp1=nums[i];
                nums[i]=nums[e];
                nums[e]=temp1;
                e--;
            }
        }
        
    }
}
