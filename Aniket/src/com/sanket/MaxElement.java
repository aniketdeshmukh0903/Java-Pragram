package com.sanket;

public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				  int[][] a = { { 1, 2, 3 }, { 45, 5, 6 },{7,8,9}};
				  int m=0;
				  for (int i = 0; i <3 ; i++) {
			            for (int j = 0; j < 3; j++) {
			            	if(m<a[i][j])
			            	{
			            		m=a[i][j];
			            	}
			            }
				  }
				  System.out.println(m);
	}

}
