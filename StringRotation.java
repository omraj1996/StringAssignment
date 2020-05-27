package com.topgear.topcoder.assignment.string;

import java.util.Scanner;

public class StringRotation {
	  
    static String leftrotate(String str, int d) 
    { 
            String ans = str.substring(d) + str.substring(0, d); 
            return ans; 
    } 
  
      
    static String rightrotate(String str, int d) 
    { 
            return leftrotate(str, str.length() - d); 
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		if(str.length()%2==0) {
			System.out.println(leftrotate(str, 2));
		}else {
			System.out.println(rightrotate(str, 2));
		}
	}
}
