import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        char[] nums = String.valueOf(num / 10).toCharArray();
        System.out.println(nums[nums.length - 1]);

    }
}