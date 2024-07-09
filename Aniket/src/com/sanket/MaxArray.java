package com.sanket;

public class MaxArray {
	public static void main(String[] args) {
		int a[] = {12,32,13,15,20};
		int min = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min= a[i];
				
			}
		}
		System.out.print(min);
	}

}
