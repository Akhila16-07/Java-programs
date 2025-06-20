package Strings;

public class PalindromeInarray {

	public static void main(String[] args) {
		
		String[] str= {"saas","momey","mom"};
		
		for(int i=0;i<str.length;i++) {
		
//			String rev=new StringBuffer().append(str[i]).reverse().toString();
//			if(rev.equals(str[i])) {
//				System.out.println(str[i] + " is palindrome");
//			}
			String rev="";
			String[] strr= str[i].split("");
			//System.out.println(strr.length);
			for(int j=strr.length-1;j>=0;j--) {
				rev+=strr[j];
			}
			//System.out.println(rev);
			
			if(rev.equals(str[i])) {
				System.out.println(str[i] + " is palindrome");
			}
		}
		
		
		
		
	}
}
