import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heightOfBus = input.nextInt();
        int nums = input.nextInt();
        for (int i = 0; i < nums; i++) {
            int heightOfBridge = input.nextInt();
            if (heightOfBus >= heightOfBridge) {
                System.out.print("Will crash on bridge " + (i + 1));
                System.exit(0);
            }
        }
        System.out.print("Will not crash");
    }
}