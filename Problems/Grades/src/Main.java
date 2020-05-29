import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums = input.nextInt();
        int countD = 0;
        int countC = 0;
        int countB = 0;
        int countA = 0;
        for (int i = 0; i < nums; i++) {
            int n = input.nextInt();
            if (n == 5) {
                countA++;
            } else if (n == 4) {
                countB++;
            } else if (n == 3) {
                countC++;
            } else if (n == 2) {
                countD++;
            }
        }
        System.out.println(countD + " " + countC + " " + countB + " " + countA);
    }
}