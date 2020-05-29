import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int duration = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int oneNightHotelCost = scanner.nextInt();
        int totalCost = duration * foodCostPerDay + oneWayFlightCost * 2 + (duration - 1) * oneNightHotelCost;
        System.out.println(totalCost);
    }
}