class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String , Integer> hm = new HashMap<>();
        int c = 1;
        for(int i=0 ; i<arr.length ; i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(int j=0 ; j<arr.length ; j++){
            if(hm.get(arr[j]) == 1){
                if(c == k) return arr[j];
                c++;
            }
        }
        return "";
    }
}
