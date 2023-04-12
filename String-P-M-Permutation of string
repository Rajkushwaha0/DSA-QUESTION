import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String s = "ABC";
		List<String> result = permute(s);
		System.out.print(result);
 
 
	}
 
	public static List<String> permute(String s){
		List<String> result = new ArrayList<>();
		solve(new StringBuilder(s),0,result);
		return result;
	}
 
	public static void solve(StringBuilder str , int start , List<String> result){
		if(start>=str.length()-1){
			result.add(new String(str.toString()));
			return ;
		}
		for(int i=start;i<str.length();i++){
			swap(str,i,start);
			solve(str,start+1,result);
			swap(str,i,start);
		}
	}
 
	public static void swap (StringBuilder str , int i , int j){
		char ch = str.charAt(i);
		str.setCharAt(i, str.charAt(j));
		str.setCharAt(j,ch);
	}
 
}
