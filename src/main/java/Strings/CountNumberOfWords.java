package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class CountNumberOfWords {

	public static void countCharsInString() {
		
		String input="akhillaa";
		
		int count =0;
		for(int i=0;i<input.length();i++) {
			Character ch = input.charAt(i);
			count++;
		}
		System.out.println(count);
	}
	
	public static void wordsInString() {
		String input="this is java course jsjd sdkfjsdk ajdks dsfjdk";
		String[] words =input.split("\\s");
		int wordcount= words.length;
		System.out.println(wordcount);
	}
	
	public static void countCharacterOccurencesInString() {
		String input="akhila reddy";
		char ch ='a';
		int count=0;
		String [] words = input.split("\\s");
			for(String word:words) {
			
				for(int i=0;i<word.length();i++) {
					if(word.charAt(i)==ch) {
						count++;
					}
				}	
					
		}
			System.out.println(count);
	}
	
	public static void reverseAstring() {
		String input="akhila reddydd";
	
			for(int i=input.length()-1;i>=0;i--) {
				Character ch =input.charAt(i);
				System.out.print(ch);
			}
	}
	
	public static void startingAndEndinSpacesRemove() {
		String input="  asdsa asdsds   ";
		String withoutSpaces=input.trim();
		System.out.println(withoutSpaces);
	}
	
	public static void reverseEachWordOfString() {
		String input ="java is esay";
		String[] words = input.split("\\s");
		String reverseSentence="";
		for(String word:words) {
			String reverseWord="";
			for(int i=word.length()-1;i>=0;i--) {
				reverseWord= reverseWord+word.charAt(i);
			}
			reverseSentence=reverseSentence+reverseWord+" ";
		}
		System.out.print(reverseSentence);

	}
	 
	public static void changeOddWordToUppercaseAndEvenOddsToReverseString() {
		String input ="akhila is good girl";
		String[] words =input.split("\\s");
		String reverseSentence="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String reverseWord="";
			if(i%2==1) {
				reverseWord=word.toUpperCase();
			}else {
				for(int j=word.length()-1;j>=0;j--) {
					reverseWord =reverseWord+word.charAt(j);

				}
			}
			reverseSentence =reverseSentence+reverseWord+" ";
		}
		System.out.println(reverseSentence);

	}
	
	public static void countUpperLowerDigitsAndSpecialCharInString() {
		String input="dsjdsy7Ajkjksj@^&^#&";
		int countLower=0;
		int countUpper=0;
		int countDigit=0;
		int countSpecialChar=0;
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			
			if(Character.isLowerCase(ch)) {
				countLower++;
			}else if (Character.isUpperCase(ch)) {
				countUpper++;
			}else if(Character.isDigit(ch)) {
				countDigit++;
			}else {
				countSpecialChar++;
			}
			
		}
		System.out.println(countLower);
		System.out.println(countUpper);
		System.out.println(countDigit);
		System.out.println(countSpecialChar);
		
	}
	
	public static void repeatedAndNonRepeatedChars() {
		String input="java is easy";
		for(int i=0;i<input.length();i++) {
			boolean isRepeated=false;
			char ch =input.charAt(i);
				if(ch>1) {
					isRepeated=true;
				}
		}
	}
	
	// Create an array with even postioned string
	public static void evenPositionedString() {
		String str= "java is super keka easy";
		String[] words =str.split("\\s");
		String evenWords="";
		//String[] evenWordsString = new String[evenCount];
		System.out.println(words.length);
		for(int i=0;i<words.length;i++) {
			String word =words[i];
			if(i%2==0) {
				evenWords+=word+" ";
			}
		}
		System.out.print(evenWords);
		
	}
	
	public static void maxLengthWord() {
		String str="hell how are youy";
		String[] words=str.split("\\s");
		int maxCount =0;
		String maxWord="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			
			
			int count =word.length();
			
			if(count>maxCount) {
				maxCount=count;
				maxWord=word;
			}
		}
		System.out.println(maxWord);
		System.out.println(maxCount);
	}
	
	public static void compareString() {
		/*Compare two strings, if the characters in string 1 are present in string 2, 
		 * then it should be printed as such in output, else '+' should be printed in output
		(ignore case difference)
		Input 1: New York
		Input 2: NWYR
		Output: N+w+Y+r+*/
		
		 String str1 = "New York";
	        String str2 = "NWYR";
	        str2 = str2.toLowerCase(); // Convert to lowercase to ignore case
	        str1 = str1.toLowerCase();

	        for (int i = 0; i < str1.length(); i++) {
	            char ch1 = str1.charAt(i);
	            if (str2.indexOf(ch1) != -1) { // Check if the character exists in str2
	                System.out.print(str1.charAt(i));
	            } else {
	                System.out.print("+");
	            }
	        }
	}
	
	public static void fileExtension() {
		String fileEx="password.png";
			System.out.println(fileEx.substring(fileEx.lastIndexOf(".")+1));
				//subStrinh(lastIndexOf(".)+1) +1 moves 
			/*		str.substring(8 + 1) → str.substring(9)
					Starts extracting from index 9, which is "png".
			Why +1?
			If we don't add +1, the output will be ".png" (including the dot).
			By adding +1, we skip the dot and get only "png".*/
			
			String[] str1= {"password.png","excel.jpg","sadas.png"};
			String[] withoutExtension=new String[str1.length];
			for(int i=0;i<str1.length;i++) {
				withoutExtension[i]=str1[i].substring(str1[i].lastIndexOf(".")+1);
			}
			System.out.println(Arrays.toString(withoutExtension));
	}
	
	public static void palindrome() {
		String str1="saas";
		String revStr="";
		//char ch='';
		for(int i=str1.length()-1;i>=0;i--) {
			Character ch=str1.charAt(i);
			//System.out.print(ch);
			revStr+=ch;
		}
		System.out.println(revStr);
		if(revStr.equals(str1)) {
			System.out.println("palindrme");
		}else {
			System.out.println("not palindorme");
		}
		
	}
	
	public static void main(String[] args) {
		//countCharsInString();
		//wordsInString();
		//countCharacterOccurencesInString() ;
		//reverseAstring() ;
		//startingAndEndinSpacesRemove();
		//reverseEachWordOfString() ;
		// changeOddWordToUppercaseAndEvenOddsToReverseString();
		//countUpperLowerDigitsAndSpecialCharInString();
		//evenPositionedString();
		//maxLengthWord();
		// compareString();
		//fileExtension();
		palindrome();
	}
}
