import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CashRegister {

    private Map<String, String> productDetails = new HashMap<>();

    public CashRegister() {
        // Load product details from file
        try (BufferedReader br = new BufferedReader(new FileReader("products.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                productDetails.put(parts[0], parts[1] + "," + parts[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProductDetails(String productId) {
        return productDetails.getOrDefault(productId, "Product not found");
    }

    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister();
        Keyboard keyboard = new Keyboard();
        Display display = new Display();

        String productId = keyboard.readProductId();
        String details = cashRegister.getProductDetails(productId);
        display.showProductDetails(details);
    }
}