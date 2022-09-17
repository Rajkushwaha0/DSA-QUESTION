class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(check(words[i]))
                return words[i];
        }
        return "";
    }
    public boolean check(String s){
        int j=0;
        int k=s.length()-1;
        boolean flag =true;
        while(j<k){
            if(s.charAt(j++)==s.charAt(k--)){
                continue;
            }
            else{
                flag=false;
                break;
            }
            
        }
        return flag;
    }
}
