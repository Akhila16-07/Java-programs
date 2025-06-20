package Strings;

public class RemoveNumbersFromString {

	public static void main(String[] args) {
		
		String str="1232asadsfsSDSDAD32";
		String removeNum=str.replaceAll("[0-9]", "");
		System.out.println(removeNum);
	}
	
}
