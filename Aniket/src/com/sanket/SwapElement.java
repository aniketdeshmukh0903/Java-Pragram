package com.sanket;

public class SwapElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,6};
		System.out.println("Original Array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		
		//System.out.print(a.length);
		int n=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=n;
		
		
		System.out.println("After swapping Array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		
		

	}

}
