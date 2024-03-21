int finalValueAfterOperations(char** operations, int operationsSize) {
    int x = 0;
    for(int i=0;i<operationsSize;i++){
        char* operation = *(operations+i);
        if(*(operation+1) == '+'){
            x++;
        }
        else{
            x--;
        }
    }
    return x;
}