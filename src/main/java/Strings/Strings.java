package Strings;

import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {
		
		Strings str=new Strings();
		System.out.println(str);
		
		String s1 = new String("hello");
		System.out.println(s1);
		
		
		String s2="hello";
		String s3="hello";
		System.out.println(s1==s2);	
		// == compares the address
		
		System.out.println(s1.equals(s2));
		//equals methods compares data
		System.out.println(s2.equals(s3));
		System.out.println(s2==s3);
		
		String s4="madam";
		String s5="Madam";
		System.out.println(s4.contains("y"));
		System.out.println(s4.startsWith("ma"));
		System.out.println(s4.endsWith("lo"));
		System.out.println(s4.equalsIgnoreCase(s5));
		
		String s6="asadasdasdas";
		String s7="akhilaaaareddyy";
		System.out.println(s4.length());
		System.out.println(s7.trim());
		System.out.println(s7.toLowerCase());
		System.out.println(s7.toUpperCase());
		
		char[] ch =s7.toCharArray();
		System.out.println(ch);
		System.out.println("it is divided into charcater but it looks like string " +  Arrays.toString(ch));
		
		System.out.println(s7.indexOf("i"));
		System.out.println(s7.lastIndexOf("a"));
		System.out.println(s7.substring(2,5));
		String s8= "hi hello mndfmsdnf sdfdfs sfsf";
		System.out.println(s8.length());
//		String [] s=s8.split("  ");
//		System.out.println(s);
//		String [] ss=s8.split(" ");
		System.out.println(Arrays.toString(s8.split(" ")));
	// --	"\\ " , " " both resembles same
//		for(String sh:ss) {
//			System.out.println(sh);
//		}
		
		String input = "Welcome to Java programming";
		String[] words = input.split(" ");
		for (String word : words) {
		    System.out.println(word);
		}

		
		System.out.println(s8.replace("hi", "oyr"));
		System.out.println(s8.replaceAll(s8, "hello"));
		System.out.println(s8);
		
		String st1="1232";
		System.out.println(Integer.valueOf(st1));
		int i = 232232;
		System.out.println(String.valueOf(i));
		System.out.println("*****************************");
		String st2= "";
		String st3= "  ";
		System.out.println(st2.length());
		System.out.println(st2.isEmpty());
		System.out.println(st2.isBlank());
System.out.println("********************************");
		
		System.out.println(st3.length());
		System.out.println(st3.isEmpty());
		System.out.println(st3.isBlank());
		
		
	}
}
