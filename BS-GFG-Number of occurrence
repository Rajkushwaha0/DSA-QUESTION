class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int a = fb(arr,n,x);
        int b = lb(arr,n,x);
        if(a!= -1 && b!= -1) return b-a+1;
        return 0;
        
    }
    public static int fb (int[] a , int n,int x){
        int s=0;
        int e=n-1;
        int ans=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(a[mid]==x) {
                ans=mid;
                e=mid-1;
            }
            else if(a[mid]>x){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
    public static int lb (int[] a , int n,int x){
        int s=0;
        int e=n-1;
        int ans=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(a[mid]==x) {
                ans=mid;
                s=mid+1;
            }
            else if(a[mid]>x){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
    
}
