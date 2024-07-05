public class Main {
    public static void main(String[] args) {
// Define the size of the multiplication table
        int size = 10;

// Print the header row
        System.out.println("  "); //Indentation for the first column
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.println(" "); // Print the multiplication
        for (int i = 1; i <= 12; i++) {
            for (int x = 1; x <= 20; x++) {
                // Print the row header
                System.out.print(i * x + " ");
            }
            System.out.println();
        }
    }
}

