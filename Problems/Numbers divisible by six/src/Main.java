import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int[] nums = new int[count];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < count; i++) {
            if (nums[i] % 6 == 0) {
                sum += nums[i];
            }
        }
        System.out.println(sum);
    }
}