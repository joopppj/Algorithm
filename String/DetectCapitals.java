public class DetectCapitals {
   // q:  determine if a word use capital letters correctly 
    public boolean detectCapitalUse(String word) {
         return word.equals(word.toUpperCase()) || 
               word.equals(word.toLowerCase()) ||
               Character.isUpperCase(word.charAt(0)) && 
               word.substring(1).equals(word.substring(1).toLowerCase());
    }
   // solution , just check four possible situations 
}
