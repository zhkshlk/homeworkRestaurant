import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) throws NoSuchElementException, IllegalArgumentException, NullPointerException {
        MenuItem lagman = new MenuItem("Лагман", 250);
        MenuItem manty = new MenuItem("Манты", 200);
        MenuItem kuurdak = new MenuItem("Куурдак", 350);
        MenuItem plov = new MenuItem("Плов", 300);

        List<MenuItem> lagmanList = new ArrayList<>();
        lagmanList.add(lagman);
        List<MenuItem> mantyList = new ArrayList<>();
        mantyList.add(manty);

        Order order = new Order();
        order.setItems(lagmanList);

        Order zakaz1 = new Order(1, "Бакай", lagmanList, true);
        Order zakaz2 = new Order(2, "Аман", mantyList, false);

        List<Order> orders = new ArrayList<>();
        orders.add(zakaz1);
        List<Order> orders2 = new ArrayList<>();
        orders2.add(zakaz2);

        Restaurant restaurant = new Restaurant();
        restaurant.setOrders(orders);
        restaurant.setOrders(orders2);

        restaurant.setMenu(new ArrayList<>());

        restaurant.addMenuItem(lagman);

        System.out.println(restaurant.getOrderById(2));

        restaurant.addMenuItem(manty);
        restaurant.addMenuItem(kuurdak);
        restaurant.addMenuItem(plov);

        restaurant.completeOrder(2);

        System.out.println(restaurant.toString());
    }
}