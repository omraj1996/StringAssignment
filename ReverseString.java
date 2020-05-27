package com.topgear.topcoder.assignment.string;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings");
		String s= sc.nextLine();
		String s1= sc.nextLine();
		if(s.equals(s1)) {
			int n=s.length();
			String str="";
			for(int i=n-1;i>=0;i--) {
				str+=s.charAt(i);
			}
			System.out.println("Reversed string is: "+str);
		}else {
			System.out.println("Reverse Not Supported.");
		}
	}
}
