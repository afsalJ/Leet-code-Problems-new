class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] valid = new boolean[26];
        for(int i=0;i<allowed.length();i++){
            valid[allowed.charAt(i)-'a']=true;
        } 

        int count=0;
        for(String word:words){
            if(isConsistent(word, valid))count++;
        }
        return count;
    }

    public boolean isConsistent(String a, boolean[] valid){
        for(int i=0;i<a.length();i++){
            if(!valid[a.charAt(i)-'a'])return false;
        }
        return true;
    }
}