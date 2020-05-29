import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List nums = new ArrayList();
        while (n != 0) {
            nums.add(n);
            n = input.nextInt();
        }
        if (nums.size() <= 2) {
            System.out.println("true");
            System.exit(0);
        }
        for (int i = 0; i < nums.size() - 1; i++) {
            //检测是否递减，如果递增就跳出
            if ((int) nums.get(i) < (int) nums.get(i + 1)) {
                break;
            }
            if (i == nums.size() - 2) {
                System.out.println("true");
                System.exit(0);
            }
        }
        for (int i = 0; i < nums.size() - 1; i++) {
            //检测是否递增，如果递减就跳出
            if ((int) nums.get(i) > (int) nums.get(i + 1)) {
                break;
            }
            if (i == nums.size() - 2) {
                System.out.println("true");
                System.exit(0);
            }
        }
        System.out.println("false");

    }
}
