import java.util.Scanner;

public class WasteCalculator {

    // Method to calculate total waste
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        double point1Waste = scanner.nextDouble();
        double point2Waste = scanner.nextDouble();

        // Call method
        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);

        // Display total
        System.out.println("Total Waste Collected: " + totalWaste);

        scanner.close();
    }
}