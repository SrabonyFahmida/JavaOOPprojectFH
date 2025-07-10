package Project007;

public class SimpleOrderService implements OrderService {
    @Override
    public void placedOrder(MenuItem menuItem) {
        System.out.println("Ordering " + menuItem.getName() + " for " + menuItem.getPrice());
    }
    public double calculateTotal(List<MenuItem> items) {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice(); // Will crash if item is null
        }
        return total;
    }
}
