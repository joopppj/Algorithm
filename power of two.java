public class Test {
    //q:: detemine if a int is power of two
    public boolean isPowerOfTwo(int n) {
        return (n>0&& (n&(n-1))==0);
    }
}
