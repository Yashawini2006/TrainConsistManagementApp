import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Passenger bogies list
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Remove one bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie is present.");
        } else {
            System.out.println("\nSleeper bogie is NOT present.");
        }

        // Final state
        System.out.println("\nFinal Passenger Bogies:");
        System.out.println(passengerBogies);
    }
}