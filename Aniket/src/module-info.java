import java.util.Scanner;

public class ArraysProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int [] a = new int [n];
		System.out.println("Enter the elements in an array");
		for( int i=0;i<a.length;i++)
		{
			a[i] sc.nextInt();
		}
		for (int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
