class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();
        for(int i = 0; i<n-2; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int l = 1+i, r = n-1;
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0) {
                    s.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                }
                else if(sum < 0) {
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        ans.addAll(s);
        return ans;
    }
}