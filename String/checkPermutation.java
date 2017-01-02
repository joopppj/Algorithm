package test;

import java.util.Arrays;

public class checkPermutation{
	// to determine if one string is the other string's another permutation 
	public static boolean checkPermutation(String s,String t){
		if(s.length()!=t.length())return false;
		int[] letters= new int[128];
		char[] s_array=s.toCharArray();
		for(char c:s_array)letters[c]++;
		for(int i=0;i<t.length();i++){
			int c=(int)t.charAt(i);
			letters[c]--;
			if(letters[c]<9)return false; 
		}
		return true;
		// the core idea for this solution is easy: we just need a char[] to trace one string's characters and compare it with the other string.
	}
	public static boolean checkPermutation2(String s,String t){
		if(s.length()!=t.length())return false;
		char[] ss=s.toCharArray();
		char[] tt=t.toCharArray();
		Arrays.sort(ss);
		Arrays.sort(tt);
		return ss.equals(tt);	
		//complexity for this question is MlogM+NlogN ,which is not very good. but this solution is very clean and important to know.
	}
}