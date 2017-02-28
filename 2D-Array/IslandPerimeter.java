public class Solution {
// give a grid. calculate the total perimeter of island(S) on that grid
    public int islandPerimeter(int[][] grid) {
        int n=0,m=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    n++;
                    if(i<grid.length-1&&grid[i+1][j]==1)m++;
                    if(j<grid[0].length-1&&grid[i][j+1]==1)m++;
                }
            }
        }
        return n*4-m*2;
    }
    // The core idea is that , every time when we got two connected cells, we need to minus 2 from total prerimeter. Then we only need to loop every land on the grid. 
}
