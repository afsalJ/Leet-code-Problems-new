char* maximumOddBinaryNumber(char* s){
    int count_one = 0;
    int length = strlen(s);
    for(int i=0;i<length;i++){
        if(s[i]=='1')count_one++;
    }
    for(int i=0;i<length;i++){
        if(count_one>1)
        {
            s[i]='1';
            count_one --;
        }
        else{
            s[i]='0';
        }
    }
    s[length-1]='1 ';
    return s;
}