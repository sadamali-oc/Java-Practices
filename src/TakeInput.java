import java.util.Scanner;

public class TakeInput {

    // Method to get the user's name
    public static void get_name(Scanner scan) {
        System.out.println("Your name:");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create Scanner object

        // Call the get_name method
        get_name(scan);

        scan.close(); // Close the Scanner
    }
}
