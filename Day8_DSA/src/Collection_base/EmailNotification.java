package Collection_base;

import java.util.HashSet;
import java.util.Set;

public class EmailNotification {
    public static void main(String[] args) {
        Set<String> emailQueue = new HashSet<>();
        emailQueue.add("agmial.com");
        emailQueue.add("bgmial.com");
        emailQueue.add("agmial.com");
        emailQueue.add("bgmial.com");
        emailQueue.add("cgmial.com");
        emailQueue.add("dgmial.com");
        System.out.println("emails send" + emailQueue);
        System.out.println("email:" + emailQueue);
    }
}
