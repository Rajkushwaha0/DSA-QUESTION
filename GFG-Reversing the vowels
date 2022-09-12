class Solution
{
    String modify (String s)
    {
        // your code here
        HashMap<Integer,Character> d1 = new HashMap<>();
        HashMap<Integer,Character> d = new HashMap<>();
        ArrayList<Character> l = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char t=s.charAt(i);
            if(t=='a' || t=='e' || t=='i' || t=='o' || t=='u' ){
                l.add(s.charAt(i)); 
                d1.put(i,s.charAt(i));
            }
            else{
                d.put(i,s.charAt(i));
            }
        }
        Collections.reverse(l);
        String j="";
        int k=0;
        for (int i = 0; i < s.length(); i++) {
            if(d1.containsKey(i)){
                j+=l.get(k);
                k++;
            }
            else if( d.containsKey(i)){
                j+=d.get(i);
            }

        }
        return j;
    }
}
