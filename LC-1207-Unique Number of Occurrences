class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> e: hm.entrySet()){
            if(s.contains(e.getValue())){
                return false;
            }
            else{
                s.add(e.getValue());
            }
        }
        return true;
    }
}
