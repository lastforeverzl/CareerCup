/*
 * 1.4	Write a method to decide if two strings are anagrams or not.
 */

package ArraysAndStrings;

import java.util.Arrays;

public class OneFour {
	public static void main(String[] args){
		if(AnagramForSort("hello","llohe"))
			System.out.println("these two string are anagrams");
		else
			System.out.println("these two string are not anagrams");
		
		if(AnagramForCharacter("world","world"))
			System.out.println("these two string are anagrams");
		else
			System.out.println("these two string are not anagrams");
	}
	/*
	 * solution 1: sort the string
	 */
	public static boolean AnagramForSort(String n1,String n2){
		if (Sort(n1).equals(Sort(n2)))
			return true;
		else
			return false;
	}
	public static String Sort(String str){
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);
		return sorted;
	}
	
	/*
	 * solution 2: compare each char in string
	 */
	public static boolean AnagramForCharacter(String n1, String n2){
		char[] char1=n1.toCharArray();
		char[] char2=n2.toCharArray();
		int sum1=0;
		int sum2=0;
		int[] letters = new int[256];
		for(char i:char1){
			letters[i]++;
			sum1+=i;
		}
		for(char j:char2)	sum2+=j;
		if(sum1!=sum2)
			return false;
		else{
			for(int k=0;k<char2.length;k++){
				int letter=(int)n2.charAt(k);
				if(letters[letter]==0)	return false;
				else	letters[letter]--;
			}
			for(int s=0;s<256;s++){
				if(letters[s]!=0)	return false;
			}
			return true;
		}
	}
}
