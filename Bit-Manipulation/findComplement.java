public class findComplement {
//Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
    public int findComplement(int num) {
        int i = 0;
        int j = 0;
        
        while (i < num)
        {
            i += Math.pow(2, j);
            j++;
        }
        
        return i - num;
    }
    // very easy bit question. 
}
