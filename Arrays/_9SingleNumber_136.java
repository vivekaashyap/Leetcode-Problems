
public class _9SingleNumber_136 {

    public static void main(String[] args) {
        int arr[] = {2, 2, 1}, xor = 0;
        for (int i : arr) {
            xor ^= i;
        }
        System.out.println(xor);
    }
}
