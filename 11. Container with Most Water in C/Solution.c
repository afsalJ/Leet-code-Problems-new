int maxArea(int* height, int heightSize) {
    int i = 0;
    int j = heightSize-1;
    int max_area = 0;
    while(i<j){
        int l = height[i] < height[j]? height[i]:height[j];
        int b = j-i;
        int curr_area = l*b;
        max_area = max_area>curr_area? max_area:curr_area;
        while(i<j && height[i]<=l){
            i++;
        }
        while(i<j && height[j]<=l){
            j--;
        }
    }
    return max_area;
}