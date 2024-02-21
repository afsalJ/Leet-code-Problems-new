class Solution {
    List<String> ans=new ArrayList<>();
    int flag=0;
    public List<String> wordBreak(String s, List<String> wordDict) {
        solve(s,""+s.charAt(0),1,wordDict,new ArrayList<>());
        return ans;
    }
    void solve(String s,String c,int ind,List<String> wordList,List<String> list){
        if(ind>=s.length()){
            if(wordList.contains(c)){
                list.add(c);
                flag=1;
            }
            String r="";
            int size=0;
            for(int i=0;i<list.size();i++){
                r+=list.get(i);
                size+=list.get(i).length();
                if(!(i==list.size()-1)){
                    r+=" ";
                }
            }
            if(size==s.length()){
                ans.add(r);
            }
            return;

        }
        if(!wordList.contains(c)){
            solve(s,c+s.charAt(ind),ind+1,wordList,list);
            return;
        }
        else{
            list.add(c);
            solve(s,""+s.charAt(ind),ind+1,wordList,list);
            if(flag==1){
                list.remove(list.size()-1);
                flag=0;
            }
            list.remove(list.size()-1);
            solve(s,c+s.charAt(ind),ind+1,wordList,list);
        }
    }
}