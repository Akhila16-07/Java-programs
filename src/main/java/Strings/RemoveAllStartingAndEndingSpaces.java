package Strings;

import java.util.Scanner;

public class RemoveAllStartingAndEndingSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1= s.trim();
		System.out.println(s1);
	}
}
