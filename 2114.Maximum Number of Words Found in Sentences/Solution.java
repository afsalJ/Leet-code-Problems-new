class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for(String sentence:sentences){
            int words = countWords(sentence);
            maxWords=Math.max(maxWords, words);
        }
        return maxWords;
    }

    int countWords(String s){
        int count = 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        return count;
    }
}