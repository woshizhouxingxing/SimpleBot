import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        while (i * i <= n) {
            System.out.println(i * i);
            i++;
        }
    }
}