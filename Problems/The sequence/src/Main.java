import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        for (int i = 1; count < n; i++) {
            for (int j = 1; count < n && j <= i; j++) {
                System.out.print(i + " ");
                count++;
            }

        }
    }
}