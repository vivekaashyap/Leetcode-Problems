class Solution {
    public int reverseDegree(String s) {
        
        int sum = 0;
        char ch[] = s.toCharArray();
        for(int i = 0; i<ch.length; i++){
            int value = ('z' - ch[i] + 1) * (i+1);
            sum += value;
        }
        return sum;
    }
}