import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    SearchItem();
                    break;
                case 6:
                    quit = true;
                    System.out.println("Thank you for having used the app! See you soon");
                    break;
            }
        }
    }
    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search an item from the list.");
        System.out.println("\t 6 - To quit the application.");

    }
    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem() {
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        if (groceryList.findItem(itemName) != null) {
            System.out.print("Enter replacement item: ");
            groceryList.modifyGroceryList(itemName);
        }

    }
    public static void removeItem() {
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        groceryList.removeGroceryItem(itemName);

    }
    public static void SearchItem() {
        System.out.print("Enter item to be searched: ");
        String searchItem = scanner.nextLine();
        groceryList.findItem(searchItem);

        }
}
