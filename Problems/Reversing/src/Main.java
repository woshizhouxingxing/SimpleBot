import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        String numReverse = new StringBuffer(num).reverse().toString();
        System.out.println(Integer.valueOf(numReverse));
    }
}