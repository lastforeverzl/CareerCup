/*
 * 1.8	Assume you have a method isSubstring which checks if one word is a substring of another. 
 * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using
 * only one call to isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).
 */

package ArraysAndStrings;

public class OneEight {
	public static void main(String[] args){
		if(isRotation("erbottlewat","waterbottle"))
			System.out.println("true");
		else
			System.out.println("false");
	}
	public static boolean isSubstring(String s1, String s2){
		return s1.contains(s2);
	}
	public static boolean isRotation(String s1, String s2){
		int len1 = s1.length();
		int len2 = s2.length();
		if(len1==len2&&len1>0){
			String str = s1.concat(s1);
			return isSubstring(str,s2);
		}
		return false;		
	}
}
