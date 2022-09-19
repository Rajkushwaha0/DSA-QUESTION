class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> l1 = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(hm.containsKey(sorted)){
                hm.get(sorted).add(strs[i]);
            }
            else{
                List<String> l = new ArrayList<>();
                l.add(strs[i]);
                hm.put(sorted,l);
            }
        }
        for(String s: hm.keySet()){
            l1.add(hm.get(s));
        }
        return l1;
    }
}
