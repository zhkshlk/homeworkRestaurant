import java.util.List;
import java.util.NoSuchElementException;

public class Restaurant {
    private List<Order> orders;
    private List<MenuItem> menu;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(List<MenuItem> menu) {
        this.menu = menu;
    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public Order getOrderById(int orderId) throws NoSuchElementException {
            for (Order o : orders)
                if (o.getOrderId() == orderId)
                    return o;
            return null;
    }


    public void completeOrder(int orderId) throws IllegalArgumentException {
        try {
            for (Order o : orders)
                if (o.getOrderId() == orderId)
                {o.setCompleted(true);}
        }
        catch (IllegalArgumentException illegal) {
            System.out.println("нет такого блюда в меню");
        }
    }

    @Override
    public String toString() {
        return "Restaurant{ " +
                " orders= " + orders +
                ", menu= " + menu +
                '}' + "\n";
    }
}

