class Solution {
    public int numberOfSteps(int num) {
        int c=0;
        return solve(num , c);
    }
    public int solve(int num ,int  c){
        if(num==0){
            return c;
        }
        if(num%2==0){
            return solve(num/2,c+1);
        }
        else{
            return solve(num-1,c+1);
        }
    }
}



//O(LOGN)
public int numberOfSteps(int num) {
         int c=0;
        while(num>0){
        if(num%2==1){
            num--;
            c++;
        }
            if(num==0){
                break;
            }
            num/=2;
            c++;
        }
        return c;
     }
}

