package InnerClass.localInnerClass.anonymous;

public interface Payment {
    void pay();

}
class PaymentDemo {
    public static void main(String[] args) {
        Payment p = new Payment() {
            @Override
            public void pay() {
                System.out.println("Payment done using credit card:");

            }
        };
        p.pay();
        //SCALA - java8(Strams, Annotation Lambdas,Reflection)
        Payment p1 = () -> System.out.println("Cash Payment:");
        p1.pay();
    }
}
/*
*one time implementation
* No need to create saparate class
* it is used in events and callback function
 */
