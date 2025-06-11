package String;

public class String_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[]= {'A','B','C'};
		byte b[]= {100,101,102,103};
		StringBuffer sb=new StringBuffer("java");
		StringBuilder sbu=new StringBuilder("python");
//		String s=new String(c);
//		String s=new String(b);
//		String s=new String(sb);
		String s=new String(sbu);
		//System.out.println(s);
		
		String s1=new String("java is a programming language");
		String s2=new String("Java is a programming language");
		System.out.println("Length: "+s1.length());
		System.out.println("characterAt: "+s1.charAt(0));//return character
		System.out.println("IndexOf: "+s1.indexOf("j"));//return index
		System.out.println("LastIndexOf: "+s1.lastIndexOf("a"));
		System.out.println("concat: "+s1.concat(s));
		System.out.println("Lowercase: "+s1.toLowerCase());
		System.out.println("Uppercase: "+s1.toUpperCase());
		System.out.println();
		System.out.println("Compare: "+s1.compareTo(s2));
		System.out.println("Equals: "+s1.equals(s2));
		System.out.println("EqualIgnoreCase: "+s1.equalsIgnoreCase(s2));
		System.out.println("Original String: "+s1);
		System.out.println("Contains: "+s1.contains("p"));
		System.out.println("Hashcode: "+s1.hashCode());
		System.out.println("Replace: "+s1.replace("a", "p"));
		System.out.println("Split: "+s1.split(" "));
		String obj="i"+"like"+"java";
		System.out.println(obj);
	   
	}

}
