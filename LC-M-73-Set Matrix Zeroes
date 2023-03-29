class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int column=matrix[0].length;
        int[][] matrix2=new int[row][column];
        for(int a=0;a<row;a++){
            for(int b=0;b<column;b++){
                 matrix2[a][b]=matrix[a][b];
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(matrix2[i][j]==0){
                    for(int k=0;k<row;k++) matrix[k][j]=0;
                    for(int l=0;l<column;l++) matrix[i][l]=0;
                }
            }
        }
        
    }
}
