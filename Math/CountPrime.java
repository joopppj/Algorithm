public class CountPrime {
    // give an int n, return the number of primes which are smaller than n. (n is non-negative ) 
    public static int countPrimes(int n) {
        boolean[] notPrime= new boolean[n];
        int count =0;
        for(int i=2;i<n;i++){
            if(notPrime[i]==false){
                count++;
                for(int j= 2; j*i<n;j++){
                    if(notPrime[i*j]==false)notPrime[i*j]=true;               // we use this technique to get rid of all primes.  
                }
            }
        }
        return count;
    }
    
}
