package com.sanket;

public class LastProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,6};
		int n=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				n=(a[i]*a[i]*a[i])+n;
				
			}
		}
		System.out.println(n);
		
		int m=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%3==0) {
				m=(a[i]*a[i])+m;
				
			}
		}
		System.out.println(m);
		
		int k=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%3==0 && a[i]%2==0) {
				
				k=a[i]+0;
				
			}
			
	}
		System.out.println(k);

}
}
