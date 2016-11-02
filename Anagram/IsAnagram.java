public class IsAnagram {
    // input: String  String, output: whether input is an anagram
    public boolean isAnagram(String s, String t) {
        char[]ss=s.toCharArray();
        char[]tt=t.toCharArray();
        Arrays.sort(ss);Arrays.sort(tt);
        return Arrays.equals(ss,tt);
    }
    
    // the core idea is to create a kind of standard of Anagram ,here we use the sorted char[]. then  we just need to check if t fits this standard .                  
}
