public class ClimbStairs {
    // question:You are climbing a stair case. It takes n steps to reach to the top.
    //Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
    
    public static int climbStairs(int n) {
        if(n <= 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        int base1=1;
        int base2=2;
        int all=0;
        for(int i=2;i<n;i++){
            all=base1+base2;
            base1=base2;
            base2=all;
        }
        return all;
    }
    // this question is just a fibonacci number question.  and the base cases are 1 and 2 for the situations that n=1 and n=2
}
