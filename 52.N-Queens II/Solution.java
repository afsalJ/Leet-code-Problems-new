class Solution {
    int count=0;
    public int totalNQueens(int n) {
        placeQueens(new boolean[n][n], n, 0, 0);
        return count;
    }

    public void placeQueens(boolean[][] board, int n, int row, int col){
        if(row==n){
            count++;
            return;
        }
        if(col==n){
            placeQueens(board, n, row+1, 0);
            return;
        }

        for(int i=0;i<n;i++){
            if(isValid(board,n,row,i)){
                board[row][i]=true;
                placeQueens(board,n, row+1, 0);
                board[row][i]=false;
            }
        }
    }

    public boolean isValid(boolean[][] board, int n, int row, int col){
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        int temp=col-1;
        for(int i=row-1;i>=0 && temp>=0;i--){
            if(board[i][temp--]){
                return false;
            }
        }
        temp=col+1;
        for(int i=row-1;i>=0 && temp<n;i--){
            if(board[i][temp++]){
                return false;
            }
        }
        return true;
    }
}