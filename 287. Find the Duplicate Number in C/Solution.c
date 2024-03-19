int findDuplicate(int* nums, int numsSize) {
    bool* ptr = (bool*)malloc(sizeof(bool) * numsSize); 
    for(int i=0;i<numsSize;i++){
        *(ptr + i) = false;
    }
    for(int i = 0; i < numsSize; i++) {
        if(ptr[nums[i]]) {
            free(ptr);
            return nums[i];
        }
        else {
            ptr[nums[i]] = true;
        }
    }
    free(ptr);
    return -1;
}
