package Practice;

public class practice1 {

	public static void main(String[] args) {
//		
//		String s1="Akhlasqws@s11ASASAS688$%^&";
//		int s2=s1.length();
//		int countOfUpperCase=0;
//		int countOfLowerCase=0;
//		int countOfSpecialChar=0;
//		for(int i=0;i<=s2;i++) {
//			char ch= s1.charAt(i);
//			if(Character.isUpperCase(ch)) {
//				countOfUpperCase++;
//			}else if(Character.isLowerCase(ch)) {
//				countOfLowerCase++;
//			}else {
//				countOfSpecialChar++;
//			}
//		}
//		System.out.println(countOfLowerCase);
//		System.out.println(countOfUpperCase);
//		System.out.println(countOfSpecialChar);
		
		String s ="Akhila as aa sdfsd";
		String[] words=s.split("\\s");
		//System.out.println(words);
		String reverseSentence="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			
			String reverseWord="";
			if(i%2==0) {
				for(int j=word.length()-1;j>0;j++) {
					reverseWord=reverseWord+word.charAt(i);
					
				}
				reverseSentence=reverseWord+" ";
			}else {
				String uppercase=word.toUpperCase();
				reverseSentence=reverseWord+uppercase + " ";
			}
		}
		System.out.println(reverseSentence);
	}
}
