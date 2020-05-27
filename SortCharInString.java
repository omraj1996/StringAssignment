package com.topgear.topcoder.assignment.string;

import java.util.Arrays;
import java.util.Scanner;

public class SortCharInString {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		char arr[]= str.toCharArray();
		Arrays.sort(arr);
		String string=String.valueOf(arr);
		int len=string.length();
		String s="";
		for(int i=0;i<len;i++) {
			if(i%2!=0) {
				s+=string.charAt(i);
			}
		}
		System.out.println(s);
	}
}
