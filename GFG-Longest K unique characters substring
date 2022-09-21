class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer> hm1 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character ch1=s.charAt(i);
            hm1.put(ch1,hm1.getOrDefault(ch1,0)+1);
        }
        if(hm1.size()<k){
            return -1;
        }
        int ws=0;
        int maxlength=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int we=0;we<s.length();we++){
            Character ch=s.charAt(we);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            while(hm.size()>k){
                Character left=s.charAt(ws);
                hm.put(left,hm.get(left)-1);
                if(hm.get(left)==0){
                    hm.remove(left);
                }
                ws++;
            }
            maxlength=Math.max(maxlength,we-ws+1);

        }

        return (maxlength);
    }
}
