import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean b = scanner.nextBoolean();
        boolean result = true;
        if (b) {
            result = a >= 15 && a <= 25;
        } else {
            result = a >= 10 && a <= 20;
        }
        System.out.println(result);
    }
}