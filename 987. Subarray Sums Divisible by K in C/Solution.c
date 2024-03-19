int subarraysDivByK(int* nums, int numsSize, int k) {
    int arr[k], c=0, r=0;
    for(int i=1;i<k;i++)
        arr[i]=0;
    arr[0]=1;
    for(int i=0;i<numsSize;i++){
        r=(r+nums[i])%k;
        if(r<0) r+=k;
        c+=arr[r];
        arr[r]++;
    }
    return c;
}