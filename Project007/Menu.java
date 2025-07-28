package Project007;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addItem(new MenuItem("Coffee", 3.5));
        menu.addItem(new MenuItem("Sandwich", 5.0));
        menu.addItem(new MenuItem("Cake", 4.0));

        OrderService orderService = new SimpleOrderService();

        // Simulated user input
        List<Integer> selectedIndices = Arrays.asList(0, 2, 10); // includes an invalid index for testing
        List<MenuItem> itemsToOrder = selectItemsFromMenu(menu, selectedIndices);

        orderService.placeOrder(itemsToOrder);
    }

    // FIXED: selectItemsFromMenu now caches item list and checks bounds
    public static List<MenuItem> selectItemsFromMenu(Menu menu, List<Integer> selectedIndices) {
        List<MenuItem> selectedItems = new ArrayList<>();
        List<MenuItem> allItems = menu.getItems();
        for (int index : selectedIndices) {
            if (index >= 0 && index < allItems.size()) {
                selectedItems.add(allItems.get(index));
            } else {
                System.out.println("Warning: Invalid menu index " + index + " skipped.");
            }
        }
        return selectedItems;
    }
}