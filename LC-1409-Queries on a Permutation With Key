class Solution {
    public int[] processQueries(int[] queries, int m) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=1;i<=m;i++){
            list.addLast(i);
        }
        int result[] = new int[queries.length];
        int i = 0;
        while(i < queries.length){
            int x = list.indexOf(queries[i]);
            result[i] = x;
            list.remove(x);
            list.addFirst(queries[i]);
            i++;
        }
        return result;
    }
}



my solution
class Solution {
    public int[] processQueries(int[] queries, int m) {
        int n=queries.length;
        int[] ans = new int[n];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=1;i<=m;i++) {
            hm.put(i,i-1);
        }
        for(int i = 0 ;i < n ;i++){
            int index=hm.get(queries[i]);
            ans[i]=hm.get(queries[i]);
            change(index,hm,queries[i]);
        }
        return ans;
    }
    public HashMap<Integer,Integer> change(int i , HashMap<Integer,Integer> hm,int num){
        int b=hm.get(num);
        for(Integer j : hm.keySet()){
            if(hm.get(j)<i) hm.put(j,hm.get(j)+1);
        }
        hm.put(num,0);
        return hm;
    }
}
