class Solution {
    public String longestPalindrome(String s) {
        String palindrome = "";
        for(int i=0;i<s.length();i++){
            for(int j=s.length();j>i;j--){
                String temp = s.substring(i, j);
                if(isPalindrome(temp)){
                    if(palindrome.length() < temp.length()){
                        palindrome = temp;
                        break;
                    }
                }
            }
        }
        return palindrome;
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