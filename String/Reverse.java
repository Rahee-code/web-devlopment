package String;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java";
		
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i)+" ");
		}
		System.out.println();
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i)+" ");
		}
		System.out.println();
		System.out.println("----------------------------");
		System.out.println(reverseString("hello world"));
		System.out.println(reverseStringInEachPlace("java is a programming language"));
		//System.out.println(reverseStringInEachPlace("java%hello"));
		
		System.out.println(reverseStringInEachPlace("java.is.a.programming.language."));
		String s1="java";
		String s2="java";
		System.out.println(s1==s2 );//compare address
		String s3=new String("python");
		String s4=new String("python");
		System.out.println(s3.equals(s4));//compare content
	}
	public static String reverseString(String s) 
	{
		
		String ans="";
		String arr[]=s.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			ans+=(arr[i]+" ");
		}
		return ans;
	}
	public static String reverseStringInEachPlace(String s)
	{
		String ans="";
		String arr[]=s.split("\\.");//escaping character
		for(int i=0;i<arr.length;i++)
		{
			if(i!=arr.length-1)
			{
				ans+=reverseWord(arr[i])+".";
			}
			else {
				ans+=reverseWord(arr[i]);
			}
			
		}
		return ans;
	}
	public static String reverseWord(String s)
	{
		String ans="";
		for(int i=s.length()-1;i>=0;i--)
		{
			ans+=s.charAt(i);
		}
		return ans;
	}
	
	

}
