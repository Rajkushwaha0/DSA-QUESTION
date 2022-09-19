class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int[] arr=new int[2]; 
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        int c=0;
        int d=0;
        for(Map.Entry<Integer,Integer> e: hm.entrySet()){
            int a=e.getValue();
            System.out.print(a);
            if(a==1){
                d++;
            }
            if(a%2==0){
                c+=a/2;
            }
            if(a%2!=0 && a>2){
                c+=a/2;
                d++;
            }
        }
        arr[0]=c;
        arr[1]=d;
        return arr;
    }
}
