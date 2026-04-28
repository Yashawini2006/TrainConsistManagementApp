import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie IDs
        String[] bogieIDs = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        // Linear Search
        boolean found = false;

        for (String id : bogieIDs) {
            if (id.equals(searchKey)) {
                found = true;
                break; // stop early when found
            }
        }

        // Result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND in the train.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND.");
        }

        scanner.close();
    }
}