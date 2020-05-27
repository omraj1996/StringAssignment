package com.topgear.topcoder.assignment.string;

import java.util.Scanner;

public class AgeOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toUpperCase();
		int len = str.length();
		int l = str.charAt(len - 1) - 64;
		System.out.println("Age of string: " + (len + l));

	}
}
