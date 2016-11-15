
public class isSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if(t.length() < s.length()) return false;
        int prev = 0;
        for(int i = 0; i < s.length();i++)
        {
            char tempChar = s.charAt(i);
            prev = t.indexOf(tempChar,prev);
            if(prev == -1) return false;       // when we can not find the character in t, return false. 
            prev++;
        }
        return true;
    }
    // this algorithm is very fast because the pointer prev can jumb to the correct index of t directly (rather increase by only 1 every time)
}
