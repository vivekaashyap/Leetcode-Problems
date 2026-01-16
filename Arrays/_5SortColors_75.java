
import java.util.Arrays;

public class _5SortColors_75 {

    public static void main(String[] args) {
        int num[] = {2, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2};
        int st = 0, ed = num.length - 1;
        int i = 0;
        while (i < ed) {
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
        System.out.println(Arrays.toString(num));
    }
}
