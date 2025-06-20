package Strings;

public class PrintPyramid {

	/*
	 * 1
	 * 2 6 
	 * 3 7 10
	 * 4 8 11 13
	 * 5 9 12  14 15
	 */
	
	public static void main(String[] args) {
		int n=5;
		int m =0;
		for (int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(++m + " ");
			}
			System.out.println();
		}
	}
	
}
