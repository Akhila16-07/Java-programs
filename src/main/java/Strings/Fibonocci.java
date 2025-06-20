package Strings;

public class Fibonocci {

	public static void main(String[] args) {
		int first=0;
		int second=1;
		int next;
		int n=5;
		System.out.print(first+ " " +second+" ");
		for(int i=0;i<n;i++){
			next=first+second;
			System.out.print(next+ " ");
			first=second;
			second= next;
		
		}
	}
}
