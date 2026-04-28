// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie class
class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type) {
        this.type = type;
    }

    // Method to assign cargo safely
    public void assignCargo(String cargo) {

        try {
            // Safety rule
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Petroleum cannot be assigned to Rectangular bogie");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + type + " -> " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment process completed.\n");
        }
    }

    @Override
    public String toString() {
        return type + " -> " + cargo;
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe assignment
        b1.assignCargo("Petroleum");

        // Unsafe assignment
        b2.assignCargo("Petroleum");

        // Program continues
        System.out.println("Program continues safely...");
    }
}