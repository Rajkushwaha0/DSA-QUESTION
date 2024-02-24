//optimized
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        int i=0;
        int j=1;
        int k=0;
        while(k<n){
            if(nums[k]>=0){
                ans[i]=nums[k];
                i+=2;
            }
            else{
                ans[j]=nums[k];
                j+=2;
            }
            k++;
        }
        return ans;        
    }
}



class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        int i=0;
        int j=0;
        for(int in =0;in<n;in++){
            if(nums[in]>=0) positive.add(nums[in]);
            else negative.add(nums[in]);
        }
        int k=0;
        while(k<n){
            System.out.print(k);
            ans[k++]=positive.get(j++);
            ans[k++]=negative.get(i++);
        }
        return ans;


        
    }
}

//kuch jada bhaik gye the 
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        // ArrayList<Integer> positive = new ArrayList<>();
        // ArrayList<Integer> negative = new ArrayList<>();
        int i=0;
        int j=0;
        for(int in =0;in<n;in++){
            if(nums[in]<0) {
                i=in;
                break;
            }
        }
        for(int in = 0;in<n;in++){
            if(nums[in]>=0) {
                j=in;
                break;
            }
        }
        int k=0;
        while(i<n && j<n && k<n){
            System.out.print(k);
            ans[k++]=nums[j++];
            while(j<n){
                if(nums[j]>=0){
                    break;
                }
                j++;
            }
            ans[k++]=nums[i++];
            while(i<n){
                if(nums[i]<0){
                    break;
                }
                i++;
            }
        }
        return ans;


        
    }
}
