/*
 * 1.1 Implement an algorithm to determine if a string has all unique characters. What if
 * you can not use additional data structures?
 */

package ArraysAndStrings;

import java.util.Scanner;

public class OneOne {
	public static void main(String[] args){
		String input = "Helo";
		if(isUniqueChar(input))
			System.out.println("has all unique characters");
		else
			System.out.println("has duplicated characters");
	}
	
	public static boolean isUniqueChar(String str){
		int[] arr = new int[256];
		for(int i=0;i<str.length();i++){
			int val = str.charAt(i);
			if(arr[val]==1)
				return false;
			arr[val]=1;
		}
		return true;
	}
}
