package com.sanket;

public class FirstEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,6};
		 System.out.println("First Even No");
		for (int i = 0; i < a.length; i++)
		 { 
	           if(a[i]%2==0)
	           {
	        	   System.out.println(a[i]);
	        	   break;
	           }
	      } 
		 System.out.println("First Odd No");
		 for (int i = 0; i < a.length; i++)
		 { 
	           if(a[i]%2!=0)
	           {
	        	   System.out.println(a[i]);
	        	   break;
	           }
	      } 
		 


	}

}
