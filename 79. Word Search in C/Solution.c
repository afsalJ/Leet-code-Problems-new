int r;
int c;
char** b;

bool search(int row, int col, int i, char* word){
    if(word[i]=='\0')return true;
    if(row<0 || row>=r || col<0 || col>=c) return false;
    else if(b[row][col]!=word[i])return false;
    b[row][col]='.';

    bool result = search(row-1, col, i+1, word) || search(row+1, col, i+1, word) || search(row, col-1, i+1, word) || search(row, col+1, i+1, word);
    b[row][col]=word[i];
    return result;
}
bool exist(char** board, int boardSize, int* boardColSize, char* word) {
    r=boardSize;
    c=*boardColSize;
    b=board;
    for(int i=0;i<boardSize;i++){
        for(int j=0;j<*boardColSize;j++){
            if(search(i,j,0,word))return true;
        }
    }
    return false;
}
