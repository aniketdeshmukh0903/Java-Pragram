package com.sanket;

public class EvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 2, 3 }, { 45, 5, 6 },{7,8,9}};
		 
		  for (int i = 0; i <3 ; i++) {
	            for (int j = 0; j < 3; j++) {
	            	if(a[i][j]%2==0)
	            	{
	            		System.out.println(a[i][j]);
	            	}
	            }
		  }

	}

}
