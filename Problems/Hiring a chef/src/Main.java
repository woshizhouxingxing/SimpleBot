//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] lines = new String[5];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = input.nextLine();
        }
        System.out.print("The form for " + lines[0] + " is completed. ");
        System.out.println("We will contact you if we need a chef that cooks " + lines[4] + " dishes.");
    }
}