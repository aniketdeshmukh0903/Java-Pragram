package com.starpattern;

public class SquarePattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=7;i++) 
		{
			for(int j=1;j<=7;j++)
			{
				if ( i == j)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("==========");


for(int i=1;i<=7;i++) 
{
	for(int j=1;j<=7;j++)
	{
		if (  i+j == 8 )
		{
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
	}
	System.out.println();
}
System.out.println("==========");
for(int i=1;i<=7;i++) 
{
	for(int j=1;j<=7;j++)
	{
		if (  i+j == 8 || i == j)
		{
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
	}
	System.out.println();
}
System.out.println("==========");
for(int i=1;i<=7;i++) 
{
	for(int j=1;j<=7;j++)
	{
		if ( i == 7 || j == 1 )
		{
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
	}
	System.out.println();
}
System.out.println("==========");
for(int i=1;i<=7;i++) 
{
	for(int j=1;j<=7;j++)
	{
		if ( i == 1 ||  j == 7 )
		{
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
	}
	System.out.println();
}
System.out.println("==========");
for(int i=1;i<=7;i++) 
{
	for(int j=1;j<=7;j++)
	{
		if ( j == 1 || i+j==8 )
		{
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
	}
	System.out.println();
}
System.out.println("==========");
for(int i=1;i<=7;i++) 
{
	for(int j=1;j<=7;j++)
	{
		if ( i == 1 || i == 7 || j == 1 || j == 7 || i+j == 8 || i == j)
		{
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
	}
	System.out.println();
}
System.out.println("==========");

for(int i=1;i<=7;i++) 
{
	for(int j=1;j<=7;j++)
	{
		if ( i == 1  || i == j)
		{
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
	}
	System.out.println();
}
System.out.println("==========");
for(int i=1;i<=7;i++) 
{
	for(int j=1;j<=7;j++)
	{
		if ( i == 1 || i+j == 8 )
		{
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
	}
	System.out.println();
}

}
}