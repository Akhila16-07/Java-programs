package Strings;

public class RemoveAllOccurencesOfCharInString {

	public static void main(String[] args) {
		   String input = "hello world";
	        char charToRemove = 'l';
	        
	        String result = input.replace(String.valueOf(charToRemove), "");
	        System.out.println("Modified String: " + result);
	}
}
