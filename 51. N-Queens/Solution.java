class Solution {
    List<List<String>> ans=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        solve(n, new ArrayList<>());
        return ans;
    }

    public void solve(int n, List<String> list) {
        if(list.size()==n){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<n;i++){
            if(isValid(list, i)){
                String s="";
                for(int j=0;j<n;j++){
                    if(j==i)s+="Q";
                    else s+=".";
                }
                list.add(s);
                solve(n, list);
                list.remove(list.size()-1);
            }
        }
    }

    public boolean isValid(List<String> list, int index){
        for(String s : list){
            if(s.charAt(index) == 'Q'){
                return false;
            }
        }
        int temp = index - 1;
        for(int i = list.size() - 1; i >= 0 && temp >= 0; i--, temp--){
            String s = list.get(i);
            if(s.charAt(temp) == 'Q'){
                return false;
            }
        }
        temp = index + 1;
        for(int i = list.size() - 1; i >= 0 && temp < list.get(0).length(); i--, temp++){
            String s = list.get(i);
            if(s.charAt(temp) == 'Q'){
                return false;
            }
        }
        return true;
    }

}