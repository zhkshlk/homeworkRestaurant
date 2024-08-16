import java.util.List;

public class Order {
    private int orderId;
    private String customerName;
    private List<MenuItem> items;
    private boolean isCompleted;

    public Order() {
    }

    public Order(int orderId, String customerName,
                 List<MenuItem> items, boolean isCompleted) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = items;
        this.isCompleted = isCompleted;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
    public double calculateTotal() {
        MenuItem menuItem = new MenuItem();
        return (menuItem.getPrice() * 0.15) + menuItem.getPrice();
    }
    public void completeOrder() {
        if (isCompleted) {
            getItems().add((MenuItem) items);
            System.out.println("Заказ завершен!");
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId= " + orderId +
                ", customerName=' " + customerName + '\'' +
                ", items= " + items +
                ", isCompleted= " + isCompleted +
                '}' + "\n";
    }
}
