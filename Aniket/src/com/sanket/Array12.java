package com.sanket;

public class Array12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=0;
		  int[][] a = { { 1, 2, 3 }, { 4, 5, 6 },{7,8,9}};
		  
		  for (int i = 0; i <3 ; i++) {
	            for (int j = 0; j < 3; j++) {
	                m=m+a[i][j];
	            }
	          
	}
		  System.out.print(m);

}
}
