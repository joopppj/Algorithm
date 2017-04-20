public class Solution {
    // give a int  n^k , where k is an integer .  match this integers in this form : The n teams are given in the form of positive integers from 1 to n, which represents their initial rank. (Rank 1 is the strongest team and Rank n is the weakest team.) We'll use parentheses('(', ')') and commas(',') to represent the contest team pairing - parentheses('(' , ')') for pairing and commas(',') for partition. During the pairing process in each round, you always need to follow the strategy of making the rather strong one pair with the rather weak one.
    public String findContestMatch(int n) {
    // collect all numbers 
        List<String> matches = new ArrayList<>();
        for(int i = 1; i <= n; i++) matches.add(String.valueOf(i));
    
    
        while(matches.size() != 1){
            List<String> newRound = new ArrayList<>();
            for(int i = 0; i < matches.size()/2; i++)  // split it into two parts  
                newRound.add("(" + matches.get(i) + "," + matches.get(matches.size() - i - 1) + ")");
                
            matches = newRound;//replace the old one 
        }
        return matches.get(0);
    }
    
}
