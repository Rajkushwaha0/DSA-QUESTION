class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		boolean[] arr={false,false,false,false,false,true,true,true,true,true};
		System.out.print(first(arr)+" "+last(arr));
	}
	public static int first(boolean[] arr){
		int i=0;
		int j=arr.length-1;
		int ans=-1;
		while(i<=j){
			int mid=(i+j)/2;
			if(arr[mid]==false){
				i=mid+1;
			}
			else{
				ans=mid;
				j=mid-1;
			}
		}
		return ans;
		
	}
	
	public static int last(boolean[] arr){
		int i=0;
		int j=arr.length-1;
		int ans=-1;
		while(i<=j){
			int mid=(i+j)/2;
			if(arr[mid]==false){
				i=mid+1;
			}
			else{
				ans=mid;
				i=mid+1;
			}
		}
		return ans;
		
	}
}
