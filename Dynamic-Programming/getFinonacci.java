public class getFinonacci{
    public static fibonacci(int n){
        return fibonacci(n, new int[n+1]);
    }
    public static fibonacci(int i, int[] array){
    if(i==0||i==1)return i;
    if(array[i]==0){
      array[i]= fibonacci(i-1,array)+fibonacci(i-2,array);
    }
    return array[i];
    }
    // this is classical dynamic programming example from cc189
    //  if we use recursion directly , we will make many duplicates, which consume lots of time. So, we need to use an array to memorize those sub questions we already solved. 
}
