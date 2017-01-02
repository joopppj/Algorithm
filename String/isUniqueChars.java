package test;

public class isUniqueChars{
	// to determine if all chars in this string are unique
	public static boolean isUniqueChars(String str){
		if(str.length()>128)return false;
		boolean[] char_set=new boolean[128];
		for(int i=0;i<str.length();i++){
			int val=str.charAt(i);                
			if(char_set[val])return false;
			char_set[val]=true;
		}
		return true;
	}  // the core idea it to using char_set to trace all ascii characters 
	// the complexity is a big constant since str.length() cannot be larger than 128 

	public static void main(String[] main){
		System.out.println(isUniqueChars("ffsdafsdaf"));
	}
}