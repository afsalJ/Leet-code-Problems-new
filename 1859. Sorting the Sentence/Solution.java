class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        for(int i=0;i<words.length;i++){
            String word = words[i];
            int n = word.length();
            int index = word.charAt(n-1);
            int j = i - 1;
            while(j>=0){
                int n1 = words[j].length();
                int i1 = words[j].charAt(n1-1);
                if(i1>index){
                    words[j+1]=words[j];
                    j--;
                }
                else{
                    break;
                }
            }
            words[j+1]=word;
        }

        String res = "";
        for(int i=0;i<words.length;i++){
            res+=words[i].substring(0, words[i].length()-1);
            if(i!=words.length-1){
                res+=" ";
            }
        }
        return res;
    }
}