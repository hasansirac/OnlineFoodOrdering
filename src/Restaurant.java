import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private List<MenuItem> menu;
    private double rating;

    public Restaurant(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
        this.rating = 0.0;
    }
    // Adds a new dish to the restaurant's menu list dynamically
    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    public List<MenuItem> getMenu() {
        return menu;
    }
}
