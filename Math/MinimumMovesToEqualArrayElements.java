public class MinimumMovesToEqualArrayElements{
    public int minMoves(int[] nums) {
    //Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal, where a move is incrementing n - 1 elements by 1.
        return IntStream.of(nums).sum() - nums.length * IntStream.of(nums).min().getAsInt();
    }
    // increase n-1 elements is equal to decrease 1 element, so we only need to calculate how many decreaments we need 
}
