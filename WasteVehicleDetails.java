import java.util.Scanner;

public class WasteVehicleDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int vehicleNumber = scanner.nextInt();
        double wasteCollected = scanner.nextDouble();
        int collectionPoints = scanner.nextInt();
        char vehicleStatus = scanner.next().charAt(0);

        // Output
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected: " + wasteCollected + " kg");
        System.out.println("Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);

        scanner.close();
    }
}

    }
    
}
