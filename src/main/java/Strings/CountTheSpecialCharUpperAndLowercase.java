package Strings;

public class CountTheSpecialCharUpperAndLowercase {

	public static void main(String[] args) {
		
		String sent ="thIsIsAjaVA@SD%";
		int countUpperCase=0;
		int countLowerCase=0;
		int specialChar=0;
		
		for(int i=0;i<sent.length();i++) {
			char ch =sent.charAt(i);
		//	System.out.println(ch);
			if(Character.isUpperCase(ch)) {
				countUpperCase++;
			}else if(Character.isLowerCase(ch)) {
				countLowerCase++;
			}else {
				specialChar++;
			}
		}
		System.out.println("Lowercase "+countLowerCase);
		System.out.println("Upper case " +countUpperCase);
		System.out.println("Special char " +specialChar);
		
	}
}
