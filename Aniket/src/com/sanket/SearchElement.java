package com.sanket;

public class SearchElement {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,4,5,6};
		int num=5;
		for(int i=0;i<a.length;i++)
{
	if(a[i]==num) {
		System.out.println(i);
		break;
		
}
	else
	{
		System.out.println(-1);
	}
}
		

	}

	
	
}
