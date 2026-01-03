import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order extends BaseEntity {
    private List<MenuItem> items = new ArrayList<>();

    public Order(int id) {
        this.id = id;
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double getTotalPrice() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public String getInfo() {
        return "Order #" + id + ", total: " + getTotalPrice();
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", items=" + items +
                ", total=" + getTotalPrice() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return id == order.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
