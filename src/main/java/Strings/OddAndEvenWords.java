package Strings;

public class OddAndEvenWords {

	//change odd words into uppercase and reverse the even words
	//This  is a  java
	//  0	1  2	3	
	
	//result :- sihT IS a JAVA
	
	public static void main(String[] args) {
	
		String Sentence ="This is java world ";
		String[] words= Sentence.split(" ");
		
		System.out.println(words.length);
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (i % 2 == 0) { // Even-indexed words (reverse them)
                String reverseWord = "";
                for (int j = word.length() - 1; j > 0; j--) {
                    reverseWord += word.charAt(j);
                }
                result += reverseWord + " ";
            } else { // Odd-indexed words (convert to uppercase)
                result += word.toUpperCase() + " ";
            }
        }

        // Trim and print the final result
        System.out.println("Transformed Sentence: " + result.trim());
   
		
		
	
	}
}


/*
String Sentence ="This is A java";
String[] words= Sentence.split(" ");

String reverseSentence= "";
String upperCase="";
for(String word :words) {
	String reverseWord="";
	//System.out.println(word);
	//System.out.println(word.length());
	for(int i=0;i<=0;i++) {
		
		if(i%2==0) {
			System.out.println("even");
			System.out.println(word.length());
			for(int j=word.length()-1;j>=0;j--) {
				reverseWord+=word.charAt(j);
			}
			System.out.println("Reverse word " +reverseWord);				
		}
		
			else {
				System.out.println("odd");
				upperCase=word.toUpperCase();
				System.out.println(upperCase);
			}
		
		
	}
	//System.out.println(reverseWord);*/
