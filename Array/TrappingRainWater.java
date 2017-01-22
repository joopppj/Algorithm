public class TrappingRainWater {
    // a famous question Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
    // for example ,[1,0,1] returns 1. 

For example, 
Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
    public static int TrappingRainWater(int[] height) {
        int a=0;int b=height.length-1;
        int max=0;
        int leftmax=0;int rightmax=0;           // we set rightmax/leftmax as the max height we met on right/left side so far
        while(a<=b){
            leftmax=Math.max(leftmax,height[a]);               
            rightmax=Math.max(rightmax,height[b]);
            if(leftmax<rightmax){                         // if rightmax is greater, it mean we do not need to worry about if right side is high enough , we just focus on left side
                max+=(leftmax-height[a]);
                a++;
            }
            else{                               //and vice verse.
            max+=(rightmax-height[b]);
            b--;
            }
        }
        return max;
    }
}
