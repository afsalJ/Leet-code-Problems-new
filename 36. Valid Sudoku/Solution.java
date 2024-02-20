class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.' && !isValid(board, i ,j)){
                    return false;
                }
            }
        }

        return true;
    }

    boolean isValid(char[][] board, int row, int col){
        for(int i=0;i<col;i++){
            if(board[row][i]==board[row][col])
            {
                return false;
            }
        }

        for(int i=0;i<row;i++){
            if(board[i][col]==board[row][col]){
                return false;
            }
        }

        int rs=row - (row%3);//row start
        int cs=col - (col%3);//column start
        int cnt=0;
        for(int i=rs;i<rs+3;i++){
            for(int j=cs;j<cs+3;j++){
                if(board[i][j]==board[row][col]){
                    cnt++;
                }
            }
        }
        if(cnt>1)
        {
            return false;
        }

        return true;
    }
}