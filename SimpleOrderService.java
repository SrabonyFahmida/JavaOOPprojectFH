package JavaOOPprojectFH;

public class SimpleOrderService implements OrderService {
    @Override
    public void placedOrder(MenuItem menuItem) {
        System.out.println("Ordering " + menuItem.getName() + " for " + menuItem.getPrice());
    }
}
