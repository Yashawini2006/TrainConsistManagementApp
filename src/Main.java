import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Unsorted bogie IDs
        String[] bogieIDs = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Sort before binary search
        Arrays.sort(bogieIDs);

        System.out.println("\nSorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIDs));

        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to search: ");
        String key = scanner.nextLine();

        // Binary Search
        int low = 0;
        int high = bogieIDs.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = bogieIDs[mid].compareTo(key);

            if (result == 0) {
                found = true;
                break;
            } else if (result < 0) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }

        // Result
        if (found) {
            System.out.println("Bogie ID " + key + " FOUND.");
        } else {
            System.out.println("Bogie ID " + key + " NOT FOUND.");
        }

        scanner.close();
    }
}