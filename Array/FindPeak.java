public class FindPeak {
    //Given an input array where num[i] ≠ num[i+1], find a peak element and return its index. (A peak element is an element that is greater than its neighbors.)
    
    public int generalSolution(int[] nums) {  // this is an easy O(n) solution 
        if(nums.length ==1)return 0;
        int pre=nums[0] ;
        if(pre>nums[1])return 0;
        if (nums.length==2){if(nums[1]>nums[0])return 1; else return 0;}
        for(int i=1; i<nums.length-1;i++){
            if(nums[i]>pre&&nums[i]>nums[i+1])return i;
            pre=nums[i];
        }
        return nums.length -1;
    }
    
    public int optimalSolution(int[] num) {    
    return optimalHelper(num,0,num.length-1);
}
// a simple trick of this question is :

/*If num[i-1] < num[i] > num[i+1], then num[i] is peak
If num[i-1] < num[i] < num[i+1], then num[i+1...n-1] must contains a peak
If num[i-1] > num[i] > num[i+1], then num[0...i-1] must contains a peak
If num[i-1] > num[i] < num[i+1], then both sides have peak
(n is num.length)*/
// so we can use ninary search here
public int optimalHelper(int[] num,int start,int end){
    if(start == end){
        return start;
    }else if(start+1 == end){
        if(num[start] > num[end]) return start;
        return end;
    }else{
        
        int m = (start+end)/2;
        
        if(num[m] > num[m-1] && num[m] > num[m+1]){

            return m;

        }else if(num[m-1] > num[m] && num[m] > num[m+1]){

            return optimalHelper(num,start,m-1);

        }else{

            return optimalHelper(num,m+1,end);

        }
        
    }
}
}
