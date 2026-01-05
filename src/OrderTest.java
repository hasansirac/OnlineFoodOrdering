import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderTest {

    @Test
    public void testCalculateTotal() {
        // 1. Setup: Ürünleri oluştur
        MenuItem burger = new MenuItem("Burger", 100.0, "Food");
        MenuItem cola = new MenuItem("Cola", 50.0, "Drink");

        // 2. Action: Siparişe ekle
        Order order = new Order(1);
        order.addItem(burger);
        order.addItem(cola);

        // 3. Assertion: Toplam fiyat doğru mu? (100 + 50 = 150)
        double total = order.calculateTotal();
        assertEquals(150.0, total, 0.01);
        System.out.println("Test Passed: Total is 150.0");
    }

    @Test
    public void testEmptyOrder() {
        Order order = new Order(2);
        double total = order.calculateTotal();
        assertEquals(0.0, total, 0.01);
        System.out.println("Test Passed: Empty order total is 0.0");
    }
}
