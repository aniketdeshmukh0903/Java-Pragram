package com.sanket;

public class ReverseArrat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,6};
		System.out.println("Original Array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("Reverse Array");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+ " ");
		}
		

	}

}
