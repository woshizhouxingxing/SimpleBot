import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt() + 1;
        int num2 = scanner.nextInt() + 1;
        int num3 = scanner.nextInt() + 1;
        System.out.println(num1 / 2 + num2 / 2 + num3 / 2);
    }
}