
import java.util.Arrays;

public class SearchRange_34 {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int arr[] = searchrange(nums, target);
        System.out.print(Arrays.toString(arr));
    }

    public static int[] searchrange(int[] arr, int x) {
        int result[] = {-1, -1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                if (result[0] == -1) {
                    result[0] = i;
                }
                result[1] = i;
            }
        }
        return result;
    }
}
