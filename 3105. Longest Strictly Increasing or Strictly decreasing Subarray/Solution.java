class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        
        Stack<Integer> st=new Stack<>();
        int i =0;
        int max = 1;
        int flag = 1;// 1 means increasing and vice versa
        while(i<nums.length){
            if(st.isEmpty()){
                if(i+1<nums.length && nums[i]!=nums[i+1])st.push(nums[i]);
                i++;
            }
            else if(flag == 1){
                if(st.peek()<nums[i]){
                    st.push(nums[i]);
                    i++;
                }
                else { // assume the element nums[i] is smaller than st.peek()
                    max = max<st.size()? st.size():max;
                    flag = 0;
                    i-=1;
                    st = new Stack<>();
                }
            }
            else{
                if(st.peek()>nums[i]){
                    st.push(nums[i]);
                    i++;
                }
                else{ // assume the element nums[i] is greater than st.peek()
                    max = max<st.size()? st.size():max;
                    flag = 1;
                    i-=1;
                    st = new Stack<>();
                }
            }
        }
        
        max = max<st.size()?st.size():max;
        
        return max;
    }
}