class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int l=0;
        int[] res=new int[matrix.length*matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                res[l++]=matrix[i][j];
            }
        }
        Arrays.sort(res);
        return res[k-1];
    }
}
