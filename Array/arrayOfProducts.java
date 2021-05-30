import java.util.*;

class Program {
  public int[] arrayOfProducts(int[] array) {
    // Write your code here.
		
		int[] answer = new int[array.length];
		
		int leftProduct = 1;
		for(int i= 0; i< array.length;i++){
			answer[i] = leftProduct; 
			leftProduct *= array[i];
		}
		
		int rightProduct = 1; 
		for(int i= array.length-1; i>=0;i--){
			answer[i] *= rightProduct; 
			rightProduct *= array[i];
		}
		
    return answer;
  }
}

