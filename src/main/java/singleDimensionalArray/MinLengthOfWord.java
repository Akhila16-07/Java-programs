package singleDimensionalArray;

public class MinLengthOfWord {

	public static void main(String[] args) {
		
		String [] str = {"coke","chai", "dog", "mother"};
		
		String minLength= str[0];
		int indexOfMinLength=0;
		
		//System.out.println(minLength.length());
		
		for(int i = 0; i<str.length;i++) {
			if(str[i].length()<minLength.length()) {
				minLength=str[i];
				indexOfMinLength=i;
			}
		}
		System.out.println(minLength);
		System.out.println(indexOfMinLength);
	}
}
