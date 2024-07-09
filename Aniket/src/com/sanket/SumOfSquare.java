package com.sanket;

public class SumOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,6};
		System.out.println("Sum of square of elements");
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=((a[i]*a[i])+sum);
			
		}
		System.out.println(sum);

	}

}
