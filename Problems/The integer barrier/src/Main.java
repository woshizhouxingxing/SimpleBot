import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int total = 0;
        while (n != 0 && total < 1000) {
            total += n;
            n = input.nextInt();
        }
        if (total >= 1000) {
            total -= 1000;
        }
        System.out.println(total);
    }
}