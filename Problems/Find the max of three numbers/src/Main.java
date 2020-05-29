import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return 1;
            } else {
                return a >= c ? 1 : 3;
            }
        } else {
            if (b >= c) {
                return 2;
            } else {
                return b >= c ? 2 : 3;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}