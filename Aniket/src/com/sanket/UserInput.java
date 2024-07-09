package com.sanket;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--) 
			{
			System.out.print(" ");
			}
		
			for(int k=1;k<=(i*2)-1;k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}


	}

}
