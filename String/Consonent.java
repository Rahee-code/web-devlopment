package String;

public class Consonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java is a programming language";
		System.out.println(s1);
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!='a'&&s1.charAt(i)!='e'&&s1.charAt(i)!='i'&&s1.charAt(i)!='o'&&s1.charAt(i)!='u')
			{
				System.out.print(s1.charAt(i)+" ");
			}
			
		}
		System.out.println();
		//Remove whitespace in string
		System.out.println("------------------------------------");
		String s2="java is a programming language";
		System.out.println(s2);
		s2=s2.replace(" ", "");
		System.out.println(s2);
//		String ans="";
//		for(int i=0;i<s2.length();i++)
//		{
//			if(s2.charAt(i)!=' ') {
//				ans+=s2.charAt(i);
//			}
//		}
//		System.out.println(ans);
		

	}

}
