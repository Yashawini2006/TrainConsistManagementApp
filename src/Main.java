import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // LinkedHashSet for ordered + unique bogies
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt duplicate
        trainFormation.add("Sleeper"); // duplicate

        // Display formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(trainFormation);

        System.out.println("\nDuplicates are automatically ignored, order preserved.");
    }
}