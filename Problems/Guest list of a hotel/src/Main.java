//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[8];
        for (int i = 0; i < words.length; i++) {
            words[i] = input.next();
        }
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }

    }
}