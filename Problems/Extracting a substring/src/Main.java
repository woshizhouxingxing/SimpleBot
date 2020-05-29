import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int index1 = input.nextInt();
        int index2 = input.nextInt();
        System.out.println(str.substring(index1, index2 + 1));
    }
}