public class MenuItem {
    private String name;
    private double price;
    private String category;

    // Fiyat kontrolü eklenmiş Constructor
    public MenuItem(String name, double price, String category) {
        this.name = name;
        if (price < 0) {
            System.out.println("Warning: Price cannot be negative! Setting to 0.");
            this.price = 0;
        } else {
            this.price = price;
        }
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (" + price + ")";
    }
}
