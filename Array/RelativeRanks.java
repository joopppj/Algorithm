public class RelativeRanks {
    // Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".
    
    public String[] findRelativeRanks(int[] nums) {
        String[] res= new String[nums.length];
        Integer[] index = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
		index[i]=i;
	    }
	    Arrays.sort(index, (a, b) -> (nums[b] - nums[a]));
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                res[index[i]] = "Gold Medal";
            }
            else if (i == 1) {
                res[index[i]] = "Silver Medal";
            }
            else if (i == 2) {
                res[index[i]] = "Bronze Medal";
            }
            else {
                res[index[i]] = (i + 1) + "";
            }
        }

        return res;
    }
    // we need to use a new int array index to keep track original order. Then sort this array by their values in nums
}
