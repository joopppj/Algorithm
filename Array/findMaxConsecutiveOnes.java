public class findMaxConsecutiveOnes{
    // find max number of consecutive 1s in array . 
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int tmp=0;
        for(int i:nums){
            if(i==0)tmp=0;
            if(i==1)tmp++;
            if(tmp>max)max=tmp;
        }
        return max;
    }
    // extremly easy question, which does not need much talk.
}
