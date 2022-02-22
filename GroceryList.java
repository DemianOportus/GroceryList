import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
    private static ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String itemToAdd) {
        groceryList.add(itemToAdd);
    }
    public void printGroceryList() {
        System.out.println("You have: "+groceryList.size()+" items in the list");
        for(int i=0; i<groceryList.size(); i++) {
            System.out.println((i+1)+ ". "+ groceryList.get(i));
        }
    }
    public void modifyGroceryList(String itemToModify) {
        if (groceryList.contains(itemToModify)) {
            int index = groceryList.indexOf(itemToModify);
            Scanner scanner = new Scanner(System.in);
            String itemNew = scanner.nextLine();
            groceryList.set(index, itemNew);
            System.out.println("Item " + itemToModify + " is now changed to: " + itemNew);
        }
        else {
            System.out.println("Item not in the list. Therefore, cannot be modified.");
        }
    }
    public void removeGroceryItem(String itemToRemove) {
        if (groceryList.contains(itemToRemove)) {
            groceryList.remove(itemToRemove);
            System.out.println("Item " + itemToRemove + " has been successfully removed.");
        } else {
            System.out.println(itemToRemove + " not in the list");
        }
    }
    public String findItem(String itemToFind) {
        boolean exists = groceryList.contains(itemToFind);
        if (exists) {
            System.out.println("Item "+itemToFind+" has been found.");
            int position = groceryList.indexOf(itemToFind);
            System.out.println("The item is at position: "+ (position+1));
            return itemToFind;
        }
        else {
            System.out.println("Item "+itemToFind+" has NOT been found.");
            return null;
        }
    }

}
