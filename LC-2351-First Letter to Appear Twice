class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        char c='a';
        for (int i = 0; i <s.length(); i++) {
            if(hm.containsKey(s.charAt(i))){
                c=s.charAt(i);
                break;
            }
            else{
                hm.put(s.charAt(i),1);
            }
        }
        return(c);
    }
}
