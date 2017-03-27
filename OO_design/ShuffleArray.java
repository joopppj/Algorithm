
public class ShuffleArray {
    private int[] nums;
    private Random random;
    public Solution(int[] nums) {
        this.nums=nums;
        random=new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    // we just iterate the int array , and for ech index, we swap the value in this index with the other value in a random index. 
    public int[] shuffle() {
        if(this.nums==null)return null;
        int[] a=nums.clone();
        for(int j = 1; j < a.length; j++) {
            int i = random.nextInt(j + 1);
            swap(a, i, j);
        }
        return a;
    }
    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
// simple design question
