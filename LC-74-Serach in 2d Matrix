//o(n^2)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}


//optimize
//binarysearch
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean a = false;
        for(int i=0;i<matrix.length;i++){
            int s=0;
            int e=matrix[i].length-1;
            int mid=(s+e)/2;
            
            while(s<=e){
                if(matrix[i][mid]==target){
                    a = true;
                    break;
                }
                if(target>matrix[i][mid]){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
                mid=(s+e)/2;
            }
        }
        return a;
    }
}
