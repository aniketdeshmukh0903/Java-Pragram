package com.sanket;

public class ReverseString {

	public static void main(String[] args) {
		String str="ABCD";
		String rev=" ";
		//StringBuffer sb= new StringBuffer(str);
		//System.out.println(sb.reverse());
		
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);
		
		}
		System.out.println("Everse String is:"+rev);
	}

}
