char* toLowerCase(char* s) {
    for(int i=0;s[i]!='\0';i++){
        if(s[i]>='A' && s[i]<='Z'){
            int nth = s[i]-'A';
            char lower = (char)('a' + nth);
            s[i]=lower;
        }
    }
    return s;
}