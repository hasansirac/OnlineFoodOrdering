public class Main {
    public static void main(String[] args) {
        System.out.println("=== ONLINE FOOD ORDERING SYSTEM TEST ===");

        // 1. Adım: Bir Müşteri Oluşturma (User ve Customer Sınıfları Testi)
        Customer customer = new Customer("hasan_ozbeyler", "12345", "555-123-4567");
        customer.login();
        customer.updateAddress("Istanbul, Bahçelievler");
        System.out.println("Customer Address: " + customer.getAddress());
        System.out.println("------------------------------------------------");

        // 2. Adım: Restoran ve Menü Oluşturma (Restaurant ve MenuItem Sınıfları Testi)
        Restaurant restaurant = new Restaurant("Lezzet Duragi");
        MenuItem burger = new MenuItem("Cheeseburger", 150.0, "Fast Food");
        MenuItem drink = new MenuItem("Cola", 30.0, "Beverage");
        MenuItem fries = new MenuItem("French Fries", 50.0, "Side");

        restaurant.addMenuItem(burger);
        restaurant.addMenuItem(drink);
        restaurant.addMenuItem(fries);

        // 3. Adım: Sipariş Verme (Order Sınıfı Testi)
        Order myOrder = new Order(1001); // Sipariş ID: 1001
        myOrder.addItem(burger);
        myOrder.addItem(drink);
        myOrder.addItem(fries);

        double total = myOrder.calculateTotal();
        System.out.println("Order Total: " + total + " TL");

        // 4. Adım: Ödeme Yapma (Interface ve Polymorphism Testi)
        // Kredi Kartı ile Ödeme
        Payment creditCard = new CreditCardPayment("4444-5555-6666-7777");
        myOrder.setPaymentMethod(creditCard);

        myOrder.placeOrder();
        creditCard.pay(total);

        System.out.println("=== TEST COMPLETED SUCCESSFULLY ===");
        System.out.println("Thank you for using our Food Ordering System!");
    }
}
