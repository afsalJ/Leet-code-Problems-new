
void fill(bool *arr, int size);

int* findDuplicates(int* nums, int numsSize, int* returnSize) {
    // Allocate memory for boolean arrays
    bool* visited = (bool*)malloc(sizeof(bool) * (numsSize + 1));
    bool* duplicates = (bool*)malloc(sizeof(bool) * (numsSize + 1));

    fill(visited, numsSize + 1);
    fill(duplicates, numsSize + 1);

    int count = 0;
    for (int i = 0; i < numsSize; i++) {
        if (visited[nums[i]]) {
            duplicates[nums[i]] = true;
            count++;
        } else {
            visited[nums[i]] = true;
        }
    }

    int* result = (int*)malloc(sizeof(int) * count);
    int index = 0;
    *returnSize = count;

    for (int i = 0; i < numsSize; i++) {
        if (duplicates[nums[i]]) {
            result[index++] = nums[i];
            duplicates[nums[i]] = false; 
        }
    }
    return result;
}
void fill(bool *arr, int size) {
    for (int i = 0; i < size; i++) {
        arr[i] = false;
    }
}
