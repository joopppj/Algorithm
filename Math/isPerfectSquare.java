public class isPerfectSquare {
    public static   boolean isPerfectSquare(int num) {
        long left=1;long right=num;
        
        while(left<=right){
            long mid = left+ (right-left)/2;
            long temp= mid*mid;
            if (temp>num){
                right=mid-1;
            }
            else if(temp<num){
                left=mid+1;
            }
            else{return true;}
            
        }
        return false; 
        // the core idea of this algorithm is using binary search to find the correct mid quickly in O(logn)
    }
}
