package Project007;

public class SimpleOrderService implements OrderService {
    @Override
    public void placedOrder(MenuItem menuItem) {
        System.out.println("Ordering " + menuItem.getName() + " for " + menuItem.getPrice());
    }
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
