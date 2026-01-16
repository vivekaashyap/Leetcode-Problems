
import java.util.*;

public class _2MoveZeroes_283 {

    // public static void main(String[] args){
    //     int a = 0, b = 1;
    //     swap(a,b);
    //     System.out.println(a+" "+b);
    // }
    // public static void swap(int a, int b){
    //     int temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.println("hehe"+a+" "+b);
    // }
    public static void main(String[] args) {
        int num[] = {0, 1, 0, 3, 12};
        int j = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(num));

    }
}
