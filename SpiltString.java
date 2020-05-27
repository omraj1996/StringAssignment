package com.topgear.topcoder.assignment.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SpiltString {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		ArrayList<String> al= new ArrayList<String>(Arrays.asList(str.split(" ")));
		int minlen=Integer.MAX_VALUE;
		String minlenstr="";
		for(int i=0;i<al.size();i++) {
			if(al.get(i).length()<minlen) {
				minlen=al.get(i).length();
				minlenstr=al.get(i);
			}
		}
		System.out.println(minlenstr);
	}
}
