class Solution {
    List<List<Integer>> ans= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        combinationsSum(candidates, 0, 0, target, new ArrayList<>());
        return ans;
    }

    public void combinationsSum(int[] arr, int index,int sum,int target,List<Integer> list){
        if(sum==target){
            ans.add(new ArrayList<>(list));
        }
        if(sum> target | index==arr.length){
            return;
        }
        for(int i=index;i<arr.length;i++){
            sum+=arr[i];
            list.add(arr[i]);
            combinationsSum(arr, i, sum, target,list);
            sum-=arr[i];
            list.remove(list.size()-1);
        }
    }
}