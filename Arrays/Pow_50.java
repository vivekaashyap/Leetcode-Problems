
import java.util.*;

public class Pow_50 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        double fin = mypow(x, n);
        System.out.println(fin);

    }

    public static double mypow(double x, int n) {
        long num = Math.abs((long) n);
        double result = 1;
        while (num > 0) {
            if (num % 2 == 1) {
                result *= x;
            }
            x *= x;
            num /= 2;
        }
        if (n < 0) {
            result = 1 / result;
        }
        return result;
    }
}
