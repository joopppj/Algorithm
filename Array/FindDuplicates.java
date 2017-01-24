public class FindDuplicates {
    //given an arraylist includes integers i (1<=i<length of array)  find all duplicates.
    public static List<Integer> FindDuplicates(int[] nums) {
        List<Integer> res= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
             if (nums[Math.abs(nums[i])-1] < 0)                     // 2. if this value is already negative , it shows index value +1 is duplicate
                res.add(Math.abs(Math.abs(nums[i])));               // 3. then we just add this duplicate to array.
            nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1]; // 1. we make the value in index i-1 negative.  (mark)
        }
        return res;
    }
}
