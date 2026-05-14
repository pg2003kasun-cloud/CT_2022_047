package Q3;
import java.util.Scanner;

public class MyJavaBurgers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Menu Data ---
        String[][] menuNames = {
                {"Tofu Burger", "Cajun Chicken", "Buffalo Wings", "Rainbow Fillet"},
                {"Rice Cracker", "No-Salt Fries", "Zucchini", "Brown Rice"},
                {"Cafe Mocha", "Cafe Latte", "Espresso", "Oolong Tea"}
        };
        double[][] menuPrices = {
                {3.49, 4.59, 3.99, 2.99},
                {0.79, 0.69, 1.09, 0.59},
                {1.99, 1.90, 2.49, 0.99}
        };

        // --- Cart Data (Parallel Arrays instead of a Class) ---
        int maxItems = 100;
        String[] cartNames = new String[maxItems];
        double[] cartPrices = new double[maxItems];
        int[] cartQtys = new int[maxItems];
        int itemCount = 0; // Keeps track of how many unique entries are in the cart

        boolean ordering = true;
        while (ordering) {
            System.out.println("\nCategories: 1. Entree 2. Side Dish 3. Drink 4. Checkout");
            System.out.print("Selection: ");
            int choice = sc.nextInt();

            int catIndex;

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    catIndex = choice - 1;

                    // Display specific menu items
                    for (int i = 0; i < menuNames[catIndex].length; i++) {
                        System.out.printf("%d. %s ($%.2f)\n", i + 1, menuNames[catIndex][i], menuPrices[catIndex][i]);
                    }

                    System.out.print("Enter ID and Quantity: ");
                    int id = sc.nextInt() - 1;
                    int qty = sc.nextInt();

                    // Store data into parallel arrays
                    if (itemCount < maxItems) {
                        cartNames[itemCount] = menuNames[catIndex][id];
                        cartPrices[itemCount] = menuPrices[catIndex][id];
                        cartQtys[itemCount] = qty;
                        itemCount++;
                    } else {
                        System.out.println("Cart is full!");
                    }
                    break;

                case 4:
                    ordering = false;
                    break;

                default:
                    System.out.println("Invalid selection.");
                    break;
            }
        }

        // --- Order Summary ---
        double total = 0;
        System.out.println("\n--- Order Summary ---");
        for (int i = 0; i < itemCount; i++) {
            double sub = cartPrices[i] * cartQtys[i];
            total += sub;
            System.out.printf("%s x%d - Unit: $%.2f Sub: $%.2f\n",
                    cartNames[i], cartQtys[i], cartPrices[i], sub);
        }
        System.out.printf("Total: $%.2f\n", total);
    }
}