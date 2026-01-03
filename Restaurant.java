import java.util.*;

public class Restaurant {
    private List<MenuItem> menu = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    public void showMenu() {
        for (MenuItem item : menu) {
            System.out.println(item);
        }
    }

    // search
    public MenuItem searchByName(String name) {
        for (MenuItem item : menu) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    // filter
    public List<MenuItem> filterByCategory(String category) {
        List<MenuItem> result = new ArrayList<>();
        for (MenuItem item : menu) {
            if (item.getCategory().equalsIgnoreCase(category)) {
                result.add(item);
            }
        }
        return result;
    }

    // sort
    public void sortByPrice() {
        menu.sort(Comparator.comparingDouble(MenuItem::getPrice));
    }

    public void addOrder(Order order) {
        orders.add(order);
    }
}
