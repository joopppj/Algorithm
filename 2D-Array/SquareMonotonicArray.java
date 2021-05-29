import java.util.*;

class Program {
  public static boolean isSquareMonotonic(int[] array) {
    // Write your code here.
		if(array.length == 0||array.length==1)return true;
		int i;
		boolean nonIncreasing = true;
		for(i=0; i< array.length-1; i++){
			if(array[i]<array[i+1]) {nonIncreasing= false;break;}
		}
		
		if(nonIncreasing){
			for(i=0; i< array.length-1; i++){
				if(array[i]<array[i+1]) {return false;}
			}
		}else if(!nonIncreasing){
			for(i=0; i< array.length-1; i++){
				if(array[i]>array[i+1]) {return false;}
			}
		}
		
		
    return true;
  }
}

