#include <stdio.h>
#include <stdlib.h>


int* twoSum(int* nums, int numsSize, int target, int* returnSize) {

    int* result = (int*)malloc(sizeof(int) * 2);
    *returnSize = 2;

    for (int i = 0; i < numsSize - 1; i++) {
        int complement = target - nums[i];
        for (int j = i + 1; j < numsSize; j++) {
            if (nums[j] == complement) {
                result[0] = i;
                result[1] = j;
                return result;
            }
        }
    }

    // If no solution is found
    *returnSize = 0;
    free(result);
    return NULL;
}