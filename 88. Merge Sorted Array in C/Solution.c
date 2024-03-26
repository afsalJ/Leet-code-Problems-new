void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n) {
    int *left = (int*)malloc(sizeof(int)*m);
    for(int i=0;i<m;i++){
        left[i]=nums1[i];
    }
    int ansIndex=0, i=0,j=0;
    while(i<m && j<n){
        if(left[i]<=nums2[j]){
            nums1[ansIndex++]=left[i++];
        }
        else{
            nums1[ansIndex++]=nums2[j++];
        }
    }

    while(i<m){
        nums1[ansIndex++]=left[i++];
    }

    while(j<n){
        nums1[ansIndex++]=nums2[j++];
    }
}