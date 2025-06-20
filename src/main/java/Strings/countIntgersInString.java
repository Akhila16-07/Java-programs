package Strings;

public class countIntgersInString {

	public static void main(String[] args) {
		String str ="$123HelloWorld456";
		char[] ch =str.toCharArray();
		int len=str.length();
		int sum=0;
		for(int i=0;i<len;i++) {
			if(Character.isDigit(ch[i])) {
				
				sum=sum+Integer.parseInt(String.valueOf(ch[i]));
			}
		}
		System.out.println(sum);
	}
}
