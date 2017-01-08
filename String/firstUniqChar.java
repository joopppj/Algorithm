public class firstUniqChar{ 
// find first char that is unique and return its index. 
  public static int firstUniqChar(String s) {
        int[] charSet= new int[26];
        for(int i=0;i<s.length();i++)charSet[s.charAt(i)-'a']++;
        for(int i=0;i<s.length();i++)if(charSet[s.charAt(i)-'a']==1)return i;
        return -1;
    }
}
