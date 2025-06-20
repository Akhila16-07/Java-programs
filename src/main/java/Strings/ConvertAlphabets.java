package Strings;

public class ConvertAlphabets {

	public static void main(String[] args) {
		
		String str= "advASDASdfdfAadsadSDS";
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(Character.isLowerCase(c)) {
				System.out.print( Character.toUpperCase(c)+" ");
			}else {
				System.out.print(Character.toLowerCase(c)+" "); 
			}
		}
	}
	
}
