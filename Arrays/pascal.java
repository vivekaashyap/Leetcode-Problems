// import java.util.ArrayList;
public class pascal {

    // static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int n = 5;
        int res = 1;
        System.out.print(1+" ");
        for (int i = 1; i < n; i++) {
            res *= n - i;
            res /= i;
            System.out.print(res + " ");
        }
    }
    // public static void ncr(int n, int c){
    //     int res = 1;
    //     for (int i = 0; i < c; i++) {
    //         res *= n - i;
    //         res /= i + 1;
    //     }
    //     list.add(res);
    // }
}
