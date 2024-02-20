class Solution {
    public List<List<Integer>> set=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        getSubsets(nums,0, new ArrayList<>());
        return set;
    }

    public void getSubsets(int[] nums,int index, List<Integer> list){
        set.add(new ArrayList<>(list));
        if(index==nums.length){
            return;
        }
        
        for(int i=index;i<nums.length;i++){
            list.add(nums[i]);
            getSubsets(nums, i+1, list);
            list.remove(list.size()-1);
        }
        return;
    }
}