class Solution {
    public int characterReplacement(String s, int k) {
        int ws=0;
        int maxfreq=0;
        int max=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int we=0;we<s.length();we++){
            char ch=s.charAt(we);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            maxfreq=Math.max(maxfreq,hm.get(ch));
            if(we-ws+1 - maxfreq>k){
                char left=s.charAt(ws);
                hm.put(left,hm.get(left)-1);
                ws++;
            }
            max=Math.max(max,we-ws+1);
        }
        return max;
    }
}
