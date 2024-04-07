bool checkIfPangram(char* sentence) {
    int n=strlen(sentence);
    if(n<26)return false;

    int* s = (int*)malloc(sizeof(int)*26);
    int count = 0;
    for(int i=0;i<n;i++){
        int index = *(sentence+i) - 'a';
        if(s[index]!=1){
            count++;
            s[index]=1;
        }
    }

    return count==26?true:false;
}