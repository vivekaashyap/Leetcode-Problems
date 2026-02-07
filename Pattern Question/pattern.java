
public class pattern {

    public static void main(String[] args) {
        firstUpper();
        lover();
    }

    public static void firstUpper() {
        for (int i = 0; i < 4; i++) {
            for (int j = 3 - i; j > 0; j--) {
                System.out.print("-");
            }
            for (int j = 3 - i + 1; j > 0; j--) {
                System.out.print("&");
            }
            System.out.println();
        }
    }

    public static void lover() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("-");
            }
            for (int j = 0; j < i + 2; j++) {
                System.out.print("&");
            }
            System.out.println();
        }

    }
}
