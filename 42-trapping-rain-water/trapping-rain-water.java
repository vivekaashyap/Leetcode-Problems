class Solution {
    public int trap(int[] height) {
        int l = 0, len = height.length, r = len - 1, trap = 0, left = 0, right = 0;
        while(l<r){
            if(height[l]<height[r]){
                if(height[l]>left) left = height[l];
                else trap += left - height[l];
                l++;
            }
            else{
                if(height[r]>right) right = height[r];
                else trap += right - height[r];
                r--;
            }
        }
        return trap;
    }
}