package DefaultInterfaces;

public class Customer implements Chargeable{
    double cartTotal;

    public Customer(double cartTotal) {
        this.cartTotal = cartTotal;
    }

    double calculatePurchaseAmount() {
        return this.chargeOnDelivery() * cartTotal;
    }
}
