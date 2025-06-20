package Strings;

public class ReverseA_String {

	public static void main(String[] args) {
		
		String s= "hi hello";
		System.out.println(s.length());
		String s1="";
		for(int i=s.length()-1; i>=0 ;i--) {
			s1=s1+s.charAt(i);
			
		}
		System.out.print(s1);
	}
}
