void sortColors(int* nums, int numsSize) {
    //insertion sort

    for(int i=1;i<numsSize;i++){
        int key = nums[i];
        int j = i -1;
        while(j>=0 && nums[j]>key){
            *(nums+j+1)=*(nums+j);
            j--;
        }
        *(nums + j + 1)=key;
    }
}