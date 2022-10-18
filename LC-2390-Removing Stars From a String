class Solution {
    public String removeStars(String s) {
        ArrayList<Character> an = new ArrayList<>();
        String ans="";
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(a!='*'){
                an.add(a);
            }
            else if(!an.isEmpty() && a=='*'){
            int m=an.size();
            an.remove(m-1);
            }
        }
        if(an.isEmpty()) return "";
        for(Character c : an){
            ans+=c;
        }
        return ans;
    }
}
