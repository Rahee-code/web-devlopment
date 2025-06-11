package String;

public class SumInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfNumber("ja12va"));
		System.out.println(takeNumber("java124"));
		System.out.println(sumOfNumberInString2("1j1a23v2a4"));

	}
	//without built-in
	public static int takeNumber(String s)
	{
	        int sum = 0;
	        for (int i = 0; i < s.length(); i++) {
	            char currentChar = s.charAt(i);
	            // Check if the character is a digit
	            if (currentChar >= '0' && currentChar <= '9') {
	                // Convert char to int by subtracting '0'
	                sum += currentChar - '0';
	            }
	        }
	        return sum;
	}
	//with built-in
	public static int sumOfNumber(String s)
	{
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				int num=Character.getNumericValue(s.charAt(i));
				sum+=num;
			}
		}
		return sum;
	}
	//py12th6o5n=12+6+5=23
	public static int sumOfNumberInString2(String s)
	{
		String temp="0";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				temp+=s.charAt(i);
			}
			else
			{
				sum+=Integer.parseInt(temp);
				temp="0";
			}
		}
		return sum;
	}


}
