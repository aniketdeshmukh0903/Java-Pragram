package com.sanket;
import java.util.Arrays;
public class ArraySort {

	public static void main(String[] args) {
	
		int a[] = {10,30,20,50,40};
//		System.out.println("Arrays before Sorting:" +Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println("Arrays After Sorting:" +Arrays.toString(a));
//		System.out.println("Arrays After Sorting:" +Arrays.toString(a));
		System.out.println("Arrays before Sorting:");
		for(int i = 0;i<a.length;i++)
		System.out.println( a[i] + " ");
		int temp =0;
		for( int i=0;i<a.length;i++)
		{
			for( int j=i+1;j<a.length;j++) 
			{
				if(a[j] < a[i])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(" Sorted Array:");
		for(int i=0;i<a.length;i++)
		System.out.println(a[i] +" ");
	}

}
