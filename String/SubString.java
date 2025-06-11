package String;

public class SubString {
	//SubString is a continuous part of a string
	//substring method always exclude the last index of string
	public static void main(String[] args) {
//		generateSubString("java");
		String s="abcabc";
		System.out.println(sub(s));

	}
//	public static void generateSubString(String s) {
//		for(int i=0;i<s.length();i++)
//		{
//			for(int j=i;j<s.length();j++)
//			{
//				//without built-in
//				for(int k=i;k<=j;k++)
//				{
//					System.out.print(s.charAt(k));
//				}
//				System.out.println();
//				//System.out.print(s.substring(i,j+1)+" ");
//			}
//		}
//	}
	static int sub(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String sub1=s.substring(i,j+1);
				if(sub1.charAt(0)==sub1.charAt(sub1.length()-1))
				{
					count++;
				}
			}
		}
		return count;
		
	}
	
}
