import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int days = 0;
        while (h > a) {
            h = h - a + b;
            days++;
        }
        if (h <= a) {
            days++;
        }
        System.out.println(days);
    }
}