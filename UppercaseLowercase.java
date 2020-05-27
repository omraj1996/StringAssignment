package com.topgear.topcoder.assignment.string;

import java.util.Scanner;

public class UppercaseLowercase {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any String.");
		String str=sc.nextLine();
		int n= str.length();
		int up=0,low=0;
		for(int i=0;i<n;i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				up++;
			}else {
				low++;
			}
		}
		if(up!=low) {
			System.out.println(str);
		}else {
			System.out.println("Equally Distributed");
		}
			
	}

}
