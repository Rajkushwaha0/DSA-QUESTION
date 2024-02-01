class Solution {
    public int[][] divideArray(int[] nums, int k) {
            Arrays.sort(nums);
        int[][] ans = new int[nums.length/3][3];
        int j=0;
        for(int i=0;i<nums.length-2;){
            int a = nums[i];
            int b = nums[i+1];
            int c = nums[i+2];
            if(Math.abs(a-b)<=k && Math.abs(c-b)<=k && Math.abs(a-c)<=k){
                ans[j][0]=a;
                ans[j][1]=b;
                ans[j][2]=c;
                j++;
            }
            else{
                return new int[0][0];
            }
            i=i+3;
        }
        return ans;
    }
}
