/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* spiralOrder(int** matrix, int matrixSize, int* matrixColSize, int* returnSize) {
    int n = matrixSize* (*matrixColSize);
    int top=0, bottom=matrixSize-1,left=0, right=*(matrixColSize)-1;
    int* spiral=(int*)malloc(sizeof(int)*n);
    *returnSize=0;

    while(top<=bottom && left<=right){
        for(int i=left;i<=right;i++){
            spiral[*returnSize]=matrix[top][i];
            (*returnSize)++;
        }
        top++;
        for(int i=top;i<=bottom;i++){
            spiral[*returnSize]=matrix[i][right];
            (*returnSize)++;
        }
        right--;
        if(top<=bottom){
            for(int i=right;i>=left;i--){
                spiral[*returnSize]=matrix[bottom][i];
                (*returnSize)++;
            }
        }
        
        bottom--;
        if(left<=right){
            for(int i=bottom;i>=top;i--){
                spiral[*returnSize]=matrix[i][left];
                (*returnSize)++;
            }
        }
        left++;
    }
    return spiral;
}