//JAVA SOLUTION


class Solution {
    public List<List<Integer>> findWinners(int[][] a) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> l1= new ArrayList<>();
        List<Integer> l2= new ArrayList<>();
        HashMap <Integer,Integer> hm =new HashMap<>();
        HashMap <Integer,Integer> hm1 =new HashMap<>();
        for (int i=0;i<a.length;i++){
            if(hm.containsKey(a[i][0])){
                hm.put(a[i][0],hm.get(a[i][0])+1);
            }
            else{
                hm.put(a[i][0],1);
            }
        }
        for (int i=0;i<a.length;i++){
            if(hm1.containsKey(a[i][1])){
                hm1.put(a[i][1],hm1.get(a[i][1])+1);
            }
            else{
                hm1.put(a[i][1],1);
            }
        }
        System.out.println(hm1);
        for(Integer k : hm.keySet()){
            if(hm1.containsKey(k)){
                continue;
            }
            else{

                l1.add(k);
            }
        }
        Collections.sort(l1); 
        l.add(l1);
        
        for (Map.Entry<Integer,Integer> e : hm1.entrySet() ){
            if(e.getValue()<2){
                l2.add(e.getKey());
            }
        }
        Collections.sort(l2); 
        l.add(l2);
        return l;
    }
}
