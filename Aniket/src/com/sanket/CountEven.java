package com.sanket;

public class CountEven {

	public static void main(String[] args) {
		  int[][] a = { { 1, 2, 3 }, { 45, 5, 6 },{7,8,9}};
		  int m=0;
		  for (int i = 0; i <3 ; i++) {
	            for (int j = 0; j < 3; j++) {
	            	if(a[i][j]%2==0)
	            	{
	            		m++;
	            	}
	            }
		  }
		  System.out.println(m);

	}

}
