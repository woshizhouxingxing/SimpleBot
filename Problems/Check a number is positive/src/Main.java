import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}