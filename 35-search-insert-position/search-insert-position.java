class Solution {
    public int searchInsert(int[] nums, int target) {
        // int n = nums.length;
        // for(int i = 0; i<n; i++){
        //     if(nums[i] == target) return i;
        //     else if(nums[i] > target) return i;
        // }
        // return n;
        int st = 0, ed = ed = nums.length-1;
        while(st<=ed){
            int mid = st+(ed-st)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid]<target) st = mid + 1;
            else ed = mid -1;
        }
        return st;
    }
}