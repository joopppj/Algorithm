public class SummaryRanges {
    // given an array of ints , get the summary of these ints. for example [1,3,4,5] returns {"1","3->5"}
    public List<String> summaryRanges(int[] nums) {
        List<String> res=new ArrayList<>();
        if(nums.length==0)return res;
        else if(nums.length==1){
            res.add(nums[0]+"");
            return res;
        }
        int pre =0;

        for(int k=0;k<nums.length;k++){
            if(k==0){
                pre=nums[k];
                continue;
            }
            if(nums[k]-nums[k-1]!=1){
                String s;
                if(pre!=nums[k-1])s=pre+"->"+nums[k-1];
                else s=pre+"";
                res.add(s);
                pre=nums[k];
            }
            if(k==nums.length-1){
                if(pre==nums[k])res.add(""+pre);
                else {
                    String s=pre+"->"+nums[k];
                    res.add(s);
                }
            }
        }
        return res;
    }
}
