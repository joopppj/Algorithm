import java.util.*;

class Program {
  public static List<Integer> spiralTraverse(int[][] array) {
    // Write your code here.
		int n = array.length;
		List<Integer> answer = new ArrayList<Integer>();
		if(array.length==1){
			answer.add(array[0][0]);
			return answer;
		}
		
		if(array.length%2==0){
			for(int i = array.length-1 ;i>=array.length/2; i--){
				
				for( int m =(array.length-i-1) ; m<=i; m++){
					answer.add(array[n-i-1][m]);
				}
				
				for( int a =(array.length-i) ; a<i; a++){
					answer.add(array[a][i]);
				}
				
				for(int b = i; b>=(array.length-i-1);b--){
					answer.add(array[i][b]);
				}
				
				for(int c = i-1; c>=(n-i);c--){
					answer.add(array[c][n-i-1]);
				}
			}
		} else if(array.length%2==1) {
			for(int i = array.length-1 ;i>array.length/2; i--){
				
				for( int m =(array.length-i-1) ; m<=i; m++){
					answer.add(array[n-i-1][m]);
				}
				
				for( int a =(array.length-i) ; a<i; a++){
					answer.add(array[a][i]);
				}
				
				for(int b = i; b>=(array.length-i-1);b--){
					answer.add(array[i][b]);
				}
				
				for(int c = i-1; c>=(n-i);c--){
					answer.add(array[c][n-i-1]);
				}
			}
			answer.add(array[array.length/2][array.length/2]);
		}
		
		
		//answer.add(n);
    return answer;
  }
}

