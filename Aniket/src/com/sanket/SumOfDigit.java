


package com.sanket;

public class SumOfDigit 
{
	public static void main(String[] args) 
	{
		int EvenSum=0;
		
		int a[]= {1,2,3,4,5};
		for(int i = 0; i <a.length; i++)
		{
			if(a[i] % 2 == 0)
			{
				EvenSum = EvenSum + a[i]; 
			}
		}		
		System.out.println("\n The Sum of Even Numbers in this Array = " + EvenSum);
	}
}