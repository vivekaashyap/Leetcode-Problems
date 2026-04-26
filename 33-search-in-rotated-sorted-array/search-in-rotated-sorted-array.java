class Solution {
    public int search(int[] nums, int target) {
        int st = 0, ed = nums.length-1;
        while(st<=ed){
            int mid = st + (ed-st)/2;
            if(nums[mid] == target) return mid;
            if(nums[st]<=nums[mid]){
                if(nums[mid] > target && nums[st] <= target){
                    ed =  mid -1;
                }else st = mid+1;
            }
            else{
                if(nums[mid] < target && nums[ed] >= target){
                    st =  mid +1;
                }else ed = mid-1;
            }
        }
        return -1;
    }
}