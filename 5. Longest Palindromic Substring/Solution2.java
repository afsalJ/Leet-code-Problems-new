class Solution {
    public String longestPalindrome(String s) {
        for(int i=s.length();i>0;i--){
            for(int j=0;j<=s.length()-i;j++){
                String temp = s.substring(j, i+j);
                if(isPalindrome(temp)){
                    return temp;
                }
            }
        }
        return "";
    }

    public boolean isPalindrome(String s){
        for(int i=0, j=s.length()-1; i<=j ; i++, j--){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }

        return true;
    }
}