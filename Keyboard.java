import java.util.Scanner;

public class Keyboard {

    public String readProductId() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        String s = scanner.nextLine();
        return s;
    }
}