class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplet=new ArrayList<>();
        HashSet<List<Integer>> triplets=new HashSet<>();
        int i=0,j=0,k=0,sum=0;
        for(i=0;i<nums.length-2;i++){
            if(nums[i]>=0)break;
            j=i+1;
            k=nums.length-1;
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    triplets.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j<k && nums[j]==nums[j+1])j++;
                    while(j<k && nums[k]==nums[k-1])k--;
                    j++;
                    k--;
                }
                else if(sum<0){
                    while(j<k && nums[j]==nums[j+1])j++;
                    j++;
                }
                else{
                    while(j<k && nums[k]==nums[k-1])k--;
                    k--;
                }
            }
        } 

        if(nums[i]==0 && i<nums.length-2){
            if(nums[i]+nums[i+1]+nums[i+2]==0){
                triplets.add(Arrays.asList(0,0,0));
            }
        }

        triplet.addAll(triplets);
        return triplet;
    }
}