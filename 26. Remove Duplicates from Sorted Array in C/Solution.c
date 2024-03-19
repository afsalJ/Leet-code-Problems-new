int removeDuplicates(int* nums, int numsSize) {
    int index = 0;
    for(int i=1;i<numsSize;i++){
        if(nums[index]!=nums[i]){
            nums[++index] = nums[i];
        }
    }
    return index+1;
}