class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int r=0,l=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R')r++;
            else l++;

            if(l==r){
                count+=1;
                r=l=0;
            }
        }
        return count;
    }
}