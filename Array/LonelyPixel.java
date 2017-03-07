public class LonelyPixel {
     // q given a matrix, which includes only 'B'and 'W' char values.  find the number of 'B' values that  dont have 'B' values on same columns/rows
    public int findLonelyPixel(char[][] picture) {
        int m = picture.length;            // get rid of edge cases
        if (m == 0) return 0;
        int n = picture[0].length;
        if (n == 0) return 0;
         
        Integer[] cIndex = new Integer[m];         // find all rows that have only one 'B'
        for (int i = 0; i < m; i++) {
            cIndex[i] = scanRow(picture, i);
        }
        
        int result = 0;
        for (int i = 0; i < m; i++) {             // find qualified 'B' values. 
            Integer col = cIndex[i];
            if (col == null) continue;
            if (scanCol(picture, col) == 1) {
                result++;
            }
        }
        
        return result; 
    }
    
    private Integer scanRow(char[][] picture, int row) {
        int n = picture[0].length;
        Integer result = null;
        for (int j = 0; j < n; j++) {
            if (picture[row][j] == 'B') {
                if (result != null) return null;
                result = j;
            }
        }
        return result;
    }
    
    private int scanCol(char[][] picture, int col) {
        int m = picture.length;
        int result = 0;
        for (int i = 0; i < m; i++) {
            if (picture[i][col] == 'B') {
                result++;
            }
        }
        return result;
    }
}
