public class RotateImage {
//question: rotate a nxn matrix by 90 degrees (clockwise)
    public void rotate(int[][] matrix) {
        for(int i = 0; i<matrix.length; i++){   
            for(int j = i; j<matrix[0].length; j++){            // we firstly swap(matrix[i][j], matrix[j][i])
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i =0 ; i<matrix.length; i++){             // then flip the matrix horizontally.
            for(int j = 0; j<matrix.length/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }
}
