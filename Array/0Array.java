package test;
public class ff{
	
void setZeoros(int[][] matrix){
	//question: given an array , if a point is 0, then set the row and col of that point 0!
	boolean[] row=new boolean[matrix.length];
	boolean[] col=new boolean[matrix[0].length];
	
	//Store the row and column  index with value 0
	for(int i=0;i<matrix.length;i++){
		for(int j=0;j<matrix[0].length;j++){
			if(matrix[i][j]==0){
				row[i]=true;
				col[j]=true;
			}
		}
	}
	for(int i=0;i<row.length;i++){
		if(row[i])nullifyRow(matrix,i);
	}
	for(int j=0;j<col.length;j++){
		if(row[j])nullifyCol(matrix,j);
	}
}

private void nullifyCol(int[][] matrix, int col) {
	// TODO Auto-generated method stub
	for(int i=0;i<matrix.length;i++){
		matrix[i][col]=0;
	}
}

private void nullifyRow(int[][] matrix, int row) {
	// TODO Auto-generated method stub
	for(int i=0;i<matrix.length;i++){
		matrix[i][row]=0;
	}
}
}
