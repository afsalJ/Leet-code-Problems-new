int balancedStringSplit(char* s) {
    int count = 0;
    int l=0,r=0;
    for(int i=0;s[i]!='\0';i++){
        if(s[i]=='R')r++;
        else l++;

        if(l==r){
            count++;
            l=r=0;
        }
    }
    return count;
}