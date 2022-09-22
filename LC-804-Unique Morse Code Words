class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<String,Integer>hm = new HashMap<>();
        String[] c={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(String s: words){
            String res="";
            for(int i=0;i<s.length();i++){
                res+=c[s.charAt(i)-'a'];
            }
            if(hm.containsKey(res)){
                continue;
            }
            else{
                hm.put(res,1);
            }
        }
        return hm.size();
    }
}
