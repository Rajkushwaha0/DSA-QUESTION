class Solution {
    public int trailingZeroes(int n) {
        if(n<=0) return 0;
        return (int)(n/5)+trailingZeroes((int)n/5);
    }
}
