import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        for (int i = 0; i < n; i++) {
            int goods = input.nextInt();
            if (goods == 1) {
                larger++;
            } else if (goods == -1) {
                smaller++;
            } else if (goods == 0) {
                perfect++;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}