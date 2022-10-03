class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans= new int[nums.length];
        Stack<Integer> s = new Stack<>();
        for(int i=nums.length-2;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=nums[i]){
                s.pop();
            }
            s.push(nums[i]);
        }
        for(int j=nums.length-1;j>=0;j--){
            while(!s.isEmpty() && s.peek()<=nums[j]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[j]=-1;
            }
            else{
                ans[j]=s.peek();
            }
            s.push(nums[j]);
        }
        return ans;
    }
}
