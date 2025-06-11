package String;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPalindrome("aba"));

	}
	public static String checkPalindrome(String a)
	{
		String rev=reverseWord(a);
		if(rev.equals(a))
		{
			return "palindrom";		
			
		}
		return "Not a Palindrom";
		
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
