    
public class missingNumber{
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int num: nums)
            sum += num;
            
        return (nums.length * (nums.length + 1) )/ 2 - sum;
    }}
    // the point of this algorithm is just sum every number up, then use the sum(if there is no missing number ) to decrease the sum, then we can get the missing number 
