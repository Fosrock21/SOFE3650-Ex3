public class Display {

    public void showProductDetails(String details) {
        String[] parts = details.split(",");
        if (parts.length == 2) {
            System.out.println("Product Name: " + parts[0]);
            System.out.println("Product Price: $" + parts[1]);
        } else {
            System.out.println(details); // If "Product not found"
        }
    }
}