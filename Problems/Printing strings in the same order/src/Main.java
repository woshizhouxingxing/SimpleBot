import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[4];
        for (int i = 0; i < words.length; i++) {
            words[i] = input.next();
        }
        for (String word : words) {
            System.out.println(word);
        }

    }
}