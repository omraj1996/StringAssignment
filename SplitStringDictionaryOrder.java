package com.topgear.topcoder.assignment.string;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SplitStringDictionaryOrder {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		ArrayList<String> al= new ArrayList<String>(Arrays.asList(str.split(" ")));
		al.sort(String::compareToIgnoreCase);
		for(int i=0; i<al.size(); i++)
		    System.out.println(al.get(i));	
	}
}
