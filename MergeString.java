package com.topgear.topcoder.assignment.string;

import java.util.Scanner;

public class MergeString {

	public static String merge(String s1, String s2) {

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < s1.length() || i < s2.length(); i++) {

			if (i < s1.length())
				result.append(s1.charAt(i));

			if (i < s2.length())
				result.append(s2.charAt(i));
		}

		return result.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println(merge(str1, str2));
	}
}
