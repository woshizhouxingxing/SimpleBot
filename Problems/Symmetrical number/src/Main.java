import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        StringBuffer str = new StringBuffer(n + "");
        for (int i = str.length(); i > 4; i++) {
            str.insert(0, "0");
        }
        int m = Integer.valueOf(str.reverse().toString());
        if (n == m) {
            System.out.println(1);
        } else {
            System.out.println(3);
        }
    }
}