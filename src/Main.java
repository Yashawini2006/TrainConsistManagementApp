import java.util.Scanner;

public class Main {

    // Method to search bogie
    public static boolean searchBogie(String[] bogieIDs, String key) {

        // ✅ Fail-fast check
        if (bogieIDs.length == 0) {
            throw new IllegalStateException("No bogies available in the train. Cannot perform search.");
        }

        // Linear Search
        for (String id : bogieIDs) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Example: change this to {} to test exception
        String[] bogieIDs = {"BG101", "BG205", "BG309"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to search: ");
        String key = scanner.nextLine();

        try {
            boolean found = searchBogie(bogieIDs, key);

            if (found) {
                System.out.println("Bogie ID " + key + " FOUND.");
            } else {
                System.out.println("Bogie ID " + key + " NOT FOUND.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}