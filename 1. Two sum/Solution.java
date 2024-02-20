class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int[] arr=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int needed=target-nums[i];
            if(map.containsKey(needed))
            {
                arr[0]=i;
                arr[1]=map.get(needed);
                break;
            }
            map.put(nums[i],i);
        }
        return arr;  
    }
}