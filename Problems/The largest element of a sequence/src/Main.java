import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        int n = 0;
        do {
            n = input.nextInt();
            if (n > max) {
                max = n;
            }
        } while (n != 0);
        System.out.println(max);

    }
}