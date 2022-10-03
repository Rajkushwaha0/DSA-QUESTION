class Solution {
    public int scoreOfParentheses(String a) {
        Stack<Integer> s= new Stack<>();
        for(int j=0 ; j<a.length() ; j++){
            char i = a.charAt(j);
            if(i == '('){
                s.push(-1);
            }
            else{
                if(s.peek() == -1){
                    s.pop();
                    s.push(1);
                }
                else{
                    int total=0;
                    while( s.peek() != -1){
                        total+=s.pop();
                    }
                    s.pop();
                    s.push(2*total);
                }
            }
        }
        int final1=0;
        while(!s.isEmpty()){
            final1+=s.pop();
        }
        return final1;
    }
}
