import java.util.ArrayList;
import java.util.List;

// Goods Bogie class
class GoodsBogie {
    String type;   // Cylindrical / Open / Box
    String cargo;  // Petroleum / Coal / Grain

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " -> " + cargo;
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // List of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));

        System.out.println("\nGoods Bogies:");
        System.out.println(goodsBogies);

        // Safety validation using Stream
        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
                );

        // Result
        if (isSafe) {
            System.out.println("\nTrain is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("\nTrain is NOT SAFE ❌");
        }
    }
}