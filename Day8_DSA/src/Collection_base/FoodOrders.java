package Collection_base;
import java.util.LinkedList;
import java.util.Queue;
public class FoodOrders {
    public static void main(String[] args) {
        Queue<String> Orders = new LinkedList<>();
        Orders.add("Order101");
        Orders.offer("Order:" + Orders);
        System.out.println("Oreder:" + Orders);
        System.out.println("Serviing" + Orders.poll());
        System.out.println("Pending order:" + Orders);
        System.out.println(Orders.element());
    }
}
