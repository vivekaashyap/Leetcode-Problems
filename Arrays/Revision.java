
public class Revision {

    public static void main(String args[]) {
        int num[] = {4, 2, 0, 3, 2, 5};
        int len = num.length;
        int lm = 0, rm = 0, l = 0, r = len - 1;
        int trap = 0;
        while (l < r) {
            if (num[l] < num[r]) {
                if (lm < num[l]) {
                    lm = num[l];
                } else {
                    trap += lm - num[l];
                }
                l++;
            } else {
                if (num[r] > rm) {
                    rm = num[r];
                } else {
                    trap += rm - num[r];
                }
                r--;
            }
        }
        System.out.print(trap);
    }
}
