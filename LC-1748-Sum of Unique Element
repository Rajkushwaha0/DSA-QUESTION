class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer>e: hm.entrySet()){
            if(e.getValue()<2){
            sum+=e.getKey();
            }
        }
        return sum;
    }
}
