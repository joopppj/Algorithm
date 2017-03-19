public class ContainsDuplicateII {
//Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0; i<nums.length;i++){
            if(i>k)set.remove(nums[i-k-1]);
            if(!set.add(nums[i]))return true;
            
        }return false;
    }
    // a very smart solution , I found on internet.  It make use of the feature of set.  And make the code become shortest. 
}
