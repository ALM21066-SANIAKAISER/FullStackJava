package Tutorials;

public class StringDemo {

	public static void main(String[] args) {
		String str ="hello";
		str=str.concat(" world");
		
		System.out.println(str);
		
		String s1="java";
		System.out.println(s1.concat("world"));
		
		String s2 ="training";
		s2.concat("world");
		System.out.println(s2);
		
		//Reversing a string
		String strRev ="Hello";
		int lenOfStr= strRev.length();
		String tmp="";
		for(int i=lenOfStr-1;i>=0;i--) {
			char t=strRev.charAt(i);
			tmp=tmp+t;
			
		}
		System.out.println(tmp);

	}

}
