import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int k = input.nextInt();
        boolean b = (k % m == 0 || k % n == 0) && m * n > k;
        if (b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}