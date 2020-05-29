import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while (n != 1) {
            System.out.println(n);
            if (n % 2 == 1) {
                n = n * 3 + 1;
            } else {
                n /= 2;
            }
        }
        System.out.println(n);
    }
}