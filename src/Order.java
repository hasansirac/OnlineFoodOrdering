import java.util.ArrayList;
import java.util.List;

public class Order implements Orderable {
    private int orderId;
    private List<MenuItem> items;
    private double totalAmount;
    private Payment paymentMethod;

    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }
    // Calculates the total price of the order by summing up all item prices
    public double calculateTotal() {
        totalAmount = 0.0;
        for (MenuItem item : items) {
            totalAmount += item.getPrice();
        }
        return totalAmount;
    }

    @Override
    public void placeOrder() {
        if (items.isEmpty()) {
            System.out.println("Error: Cannot place an empty order!");
        } else {
            System.out.println("Order placed successfully with ID: " + orderId);
        }
    }

    public void setPaymentMethod(Payment pm) {
        this.paymentMethod = pm;
    }
}
