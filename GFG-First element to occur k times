class Solution
{
    public int firstElementKTime(int[] a, int n, int k) { 
        HashMap<Integer,Integer> hm = new HashMap<>();
        if(k==1){
            return a[0];
        }
        for(int i=0;i<a.length;i++){
            if(hm.containsKey(a[i])){
                if(hm.get(a[i])+1==k){
                    return a[i];
                }
                hm.put(a[i],hm.get(a[i])+1);
            }
            else{
                hm.put(a[i],1);
            }
        }
        return -1;
    } 
}
