package String;

public class SubString_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(subString("ababa"));
		
		

	}
	public static String subString(String s)
	{
		String ans="";
		int maxlength=Integer.MIN_VALUE;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String sub=s.substring(i,j+1);
				if(checkPalindrome(sub))
				{
					//maxlength=Math.max(maxlength, sub.length());
					if(sub.length()>maxlength)
					{
						ans=sub;
						maxlength=sub.length();
						
					}
				}
			}
		}
		return ans;

		
	}
	//palindrome substring
	public static boolean checkPalindrome(String s)
	{
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		if(rev.equals(s))
		{
			return true;		
			
		}
		else
		{
			return false;
		}
	}
	
	
	
}
	
	


