package Project007;

import java.util.*;

public class SimpleOrderService implements OrderService {
    @Override
    public void placeOrder(List<MenuItem> items) {
        System.out.println("Order Summary:");
        for (MenuItem item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        double total = calculateTotal(items);
        System.out.println("Total: $" + total);
    }

    // FIXED: Added null checks to avoid crashing on null list or elements
    public double calculateTotal(List<MenuItem> items) {
        double total = 0;
        if (items == null) return total;
        for (MenuItem item : items) {
            if (item != null) {
                total += item.getPrice();
            }
        }
        return total;
    }
}