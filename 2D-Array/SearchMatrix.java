package test;

import java.util.Arrays;

public class SearchMatrix{
	// question: Write an efficient algorithm that searches for a value in an m x n ,ordered matrix (like [[1,2],[3,4]]).
	
	public static boolean SearchMatrix(int[][] matrix, int target){
		if(matrix.length==0)return false;
        int[] heads= new int[matrix.length];
		for(int i=0;i<matrix.length;i++){
			heads[i]= matrix[i][0];
		}
		int row=Arrays.binarySearch(heads, target);
		if(row<0&&matrix.length==1){if(Arrays.binarySearch(matrix[0],target)<0) return false ; 
		else return true;}  // check the situation when there is only one row 
		if(row>=0)return true; // there is a match between values in heads and target
		else if(-(row+1)==0)return false;   //  the situation that the target is smaller than first value of whole matrix
		else{
			if(Arrays.binarySearch(matrix[-(row+1)-1],target)>=0)return true;    // find a match in this row
			else return false;
		}
	}
}
