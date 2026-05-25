class Solution {
    public int maxArea(int[] height) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i= 0; i<height.length; i++){
            list.add(height[i]);
        }
        int left = 0, right = list.size()-1, max = Integer.MIN_VALUE;
        while(left<right){
            int minH = Math.min(list.get(left), list.get(right));
            int width = right - left; 
            int area = minH * width;
            max = Math.max(area, max);
            if(list.get(left) > list.get(right)) right--;
            else left++;
        }
        return max;
    }
}