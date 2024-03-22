/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
 
int isValid(char* arr, char x, int size){
    return strchr(arr,x)!=NULL;
}

int* findWordsContaining(char** words, int wordsSize, char x, int* returnSize) {
    int* indices = (int*)malloc(sizeof(int) * wordsSize);
    *returnSize = 0;
    for(int i=0; i<wordsSize;i++){
        int size = strlen(words[i]);
        if(isValid(words[i], x, size)){
            indices[*returnSize]=i;
            (*returnSize)++;
        }
    }
    indices = (int*)realloc(indices,sizeof(int) * (*returnSize));
    return indices;
}