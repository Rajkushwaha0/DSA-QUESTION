class Solution {
    public String finalString(String s) {
        StringBuilder s1 = new StringBuilder (s);
        while(s1.toString().contains("i")){
            int j = s1.indexOf("i");
            // System.out.print(j);
            int i=0;
            int e=j-1;
            while(i<=e){
                char ch = s1.charAt(i);
                char ch1 = s1.charAt(e);
                s1.setCharAt(i,ch1);
                s1.setCharAt(e,ch);
                i++;
                e--;
            }
            s1.deleteCharAt(j);
        }
    return s1.toString();
        
    }
}
