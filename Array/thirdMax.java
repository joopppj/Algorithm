public class thirdMax {
    // given an array, find the third maximum int and return it . if the thir maximum int does not exist , return the max value of this array. 
    public static int thirdMax(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer n : nums) {
            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return max3 == null ? max1 : max3;
    }
    
    // there is one thing to pay attention: if we rely on the Integer.MIN_VALUE, this question is very difficult to solve since we need to use long. 
    // but we can make use of the fact that Intger.equals(null) return false. 
}
