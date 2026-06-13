class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        for(int n: nums){
            if(count == 0) candidate = n;
            if(n == candidate) count++;
            else count--;
        }
        return candidate;
        // Arrays.sort(nums);
        // return nums[nums.length/2];
    }
}