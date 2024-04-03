int majorityElement(int* nums, int numsSize) {
    int majority_element = nums[0];
    int count = 0;
    for(int i=1;i< numsSize;i++){
        if(nums[i]==majority_element)count++;
        else if(count>0)count--;
        else if(count==0)majority_element = nums[i];
    }
    return majority_element;
}