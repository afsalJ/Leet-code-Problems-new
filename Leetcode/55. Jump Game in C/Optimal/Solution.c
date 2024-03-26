

bool canJump(int* nums, int numsSize) {
    if(numsSize==1)return true;
    int loc=numsSize-1;
    for(int i=numsSize-2;i>=0;i--){
        if(i+nums[i]>=loc){
            loc=i;
        }
    }

    return loc==0;
}
