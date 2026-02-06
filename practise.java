
public class practise {

    public static void main(String[] args) {
        double x = 2.00;
        int n = 10;
        long n1 = Math.abs((long) n);
        double pow = 1;
        while (n1 > 0) {
            if (n1 % 2 == 1) {
                pow *= x;
            }
            x *= x;
            n1 /= 2;
        }
        if (n < 0) {
            pow = 1 / pow;
        }
        System.out.println(pow);
    }
}
