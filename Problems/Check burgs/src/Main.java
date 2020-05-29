import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String city = input.nextLine();
        System.out.println(city.endsWith("burg"));
    }
}