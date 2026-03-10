package Collection_base;
import java.util.Collection;

import java.util.ArrayList;

public class Liveorders {
        public static void main(String[] args) {
            Collection<String> liveOrders = new ArrayList<>();
            liveOrders.add("ORD101");
            liveOrders.add("ORD102");
            liveOrders.add("ORD103");
            System.out.println("ORD103 Exist : "+liveOrders.contains("ORD102"));
            System.out.println("Live Orders : "+liveOrders);
            liveOrders.clear();
            System.out.println("Orders are closing :"+liveOrders);

        }
    }

