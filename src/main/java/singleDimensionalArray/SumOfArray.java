package singleDimensionalArray;

public class SumOfArray {

	public static void main(String[] args) {
		
		int i[] = {2,3,4,5,6,7,7};
		int sum =0;
		
		for(int j=0; j<i.length;j++) {
			sum=sum+i[j];
		}
		System.out.println(sum);
	}
}
