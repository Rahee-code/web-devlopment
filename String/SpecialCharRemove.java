package String;

public class SpecialCharRemove {

	public static void main(String[] args) {
		//Remove all the special character except Alphabet
		String s="Ja$v@a is @a p^rogrammi<ng language";
		System.out.println(s);
		String ans="";
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>=65&& s.charAt(i)<=90)||
					(s.charAt(i)>=97&&s.charAt(i)<=122)||s.charAt(i)==32)
			{
				ans+=s.charAt(i);
			}
		}
		System.out.println(ans);
		
		
		

	}

}
