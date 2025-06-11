package String;

import java.util.Arrays;

public class UpperLower {

	public static void main(String[] args) {
		
		//uppercase-built-in
		String s="java is a programming language";
		System.out.println(s.toUpperCase());
		//covert the given string into uppercase without using any built in method
		String ans="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ') {
				ans+=(char)(s.charAt(i)-32);//(a)97-32=65(A)
			}
			else
			{
				ans+=' ';
			}
		}
		System.out.println(ans);
		System.out.println("------------------------------------");
		//lowercase-built-in
		System.out.println(s.toLowerCase());
		//covert the given string into lowercase without using any built in method 
		String ans1="";
		String s1="JAVA IS A PROGRAMMING LANGUAGE";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=' ') {
				ans1+=(char)(s1.charAt(i)+32);//(A)65+32==97(a)
			}
			else
			{
				ans1+=' ';
			}
		}
		System.out.println(ans1);
		System.out.println("------------------------------------");
		
		
		//convert the given string to uppercase or vice versa
		String s2="JaVa Is A prOgRammiNG LAnguAge";
		System.out.println(s2);
		String ans2="";
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(i)>=65&& s2.charAt(i)<=90) {
				ans2+=(char)(s2.charAt(i)+32);//(A)65+32==97(a)
			}
			else if(s2.charAt(i)>=97 && s2.charAt(i)<=122)
			{
				ans2+=(char)(s2.charAt(i)-320);
			}
			else
			{
				ans2+=' ';
			}
		
		}
		System.out.println(ans2);
		
		System.out.println("------------------------------------");
		//count the words in a string
		//no of space+1
		String s3="java is a programming language";
		System.out.println(s3);
		int count=0;
		for(int i=0;i<s3.length();i++)
		{
			if(s3.charAt(i)==' ') 
			{
				count++;
			}
		}
		System.out.println("Total words: "+(count+1));
		
		System.out.println("--------------'Split'----------------");
		String s4="java is a programming language";
		String arr[]=s4.split(" ");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("--------------'Reverse'---------------------");
		String ans3="";
		for(int i=arr.length-1;i>=0;i--)
		{
			ans3+=(arr[i]+" ");
		}
		System.out.println(ans3);

	}

}
