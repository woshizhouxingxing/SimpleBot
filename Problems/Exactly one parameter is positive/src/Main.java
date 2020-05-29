import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean r1 = a > 0 && b <= 0 && c <= 0;
        boolean r2 = b > 0 && a <= 0 && c <= 0;
        boolean r3 = c > 0 && b <= 0 && a <= 0;
        System.out.println(r1 || r2 || r3);
    }
}