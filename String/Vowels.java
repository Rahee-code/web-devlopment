package String;

public class Vowels {

	public static void main(String[] args) {
		// Find vowels in a string
		String s1="java is a programming language";
		System.out.println(s1);
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{
				System.out.print(s1.charAt(i)+" ");
				
			}
		}
		

	}

}
