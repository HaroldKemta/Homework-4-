// made by Harold kemta 

import java.util.Scanner;

public class PBJFrontEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean restart;

        do {
            // Create two PBJSandwich instances
            System.out.println("Enter details for Sandwich 1:");
            PBJSandwich sandwich1 = createPBJSandwich(scanner);

            System.out.println("\nEnter details for Sandwich 2:");
            PBJSandwich sandwich2 = createPBJSandwich(scanner);

            // Display both sandwiches
            System.out.println("\nSandwich 1:\n" + sandwich1);
            System.out.println("\nSandwich 2:\n" + sandwich2);

            // Check if they are the same
            if (sandwich1.equals(sandwich2)) {
                System.out.println("\nThe sandwiches are the same!");
            } else {
                System.out.println("\nThe sandwiches are different.");
            }

            // Ask user if they want to restart
            System.out.print("\nWould you like to restart? (yes/no): ");
            restart = scanner.next().equalsIgnoreCase("yes");
            scanner.nextLine(); // Consume newline

        } while (restart);

        System.out.println("Goodbye!");
        scanner.close();
    }

    // Helper method to create a PBJSandwich based on user input
    private static PBJSandwich createPBJSandwich(Scanner scanner) {
        System.out.println("Enter details for the top slice of bread:");
        Bread topSlice = createBread(scanner);

        System.out.println("Enter details for the bottom slice of bread:");
        Bread bottomSlice = createBread(scanner);

        System.out.println("Enter details for the peanut butter:");
        PeanutButter peanutButter = createPeanutButter(scanner);

        System.out.println("Enter details for the jelly:");
        Jelly jelly = createJelly(scanner);

        return new PBJSandwich(topSlice, peanutButter, jelly, bottomSlice);
    }

    // Helper method to create a Bread object
    private static Bread createBread(Scanner scanner) {
        System.out.print("Brand name: ");
        String name = scanner.nextLine();

        System.out.print("Calories (50-250): ");
        int calories = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Type (Honey Wheat, White, Whole Grain, Whole Wheat): ");
        String type = scanner.nextLine();

        return new Bread(name, calories, type);
    }

    // Helper method to create a PeanutButter object
    private static PeanutButter createPeanutButter(Scanner scanner) {
        System.out.print("Brand name: ");
        String name = scanner.nextLine();

        System.out.print("Calories (100-300): ");
        int calories = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Is it crunchy? (true/false): ");
        boolean isCrunchy = scanner.nextBoolean();
        scanner.nextLine(); // Consume newline

        return new PeanutButter(name, calories, isCrunchy);
    }

    // Helper method to create a Jelly object
    private static Jelly createJelly(Scanner scanner) {
        System.out.print("Brand name: ");
        String name = scanner.nextLine();

        System.out.print("Calories (50-200): ");
        int calories = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Fruit Type (Apple, Blackberry, Grape, Blueberry, Tomato): ");
        String fruitType = scanner.nextLine();

        return new Jelly(name, calories, fruitType);
    }
}
