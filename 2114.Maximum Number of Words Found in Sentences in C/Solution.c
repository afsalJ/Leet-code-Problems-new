int mostWordsFound(char** sentences, int sentencesSize) {
    int max = 0;
    for(int i=0;i<sentencesSize;i++){
        int words = 1;
        for(int j=1;sentences[i][j]!='\0';j++){
            if(sentences[i][j]==' ')words++;
        }
        if(words>max)max=words;
    }
    return max;
}