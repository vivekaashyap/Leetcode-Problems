class Solution {
    public void sortColors(int[] num) {
        int st = 0, ed = num.length-1;
        int i = 0;
        while(i<=ed && num.length>1){
            if (num[i] == 0) {
                int temp = num[st];
                num[st] = num[i];
                num[i] = temp;
                i++;
                st++;
            } else if (num[i] == 2) {
                int temp = num[ed];
                num[ed] = num[i];
                num[i] = temp;
                ed--;
            } else {
                i++;
            }
        }
    }
}