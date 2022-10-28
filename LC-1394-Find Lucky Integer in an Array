class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer> l = new ArrayList<>();
        for( Integer j : hm.keySet()){
            if(j==hm.get(j)) l.add(j);
        }
        if(l.isEmpty()) return -1;
        Collections.sort(l);
        return l.get(l.size()-1);
    }
}
