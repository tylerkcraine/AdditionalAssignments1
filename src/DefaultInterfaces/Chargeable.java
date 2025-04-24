package DefaultInterfaces;

public interface Chargeable {
    double discount = 1.0;

    default double chargeOnDelivery() {
        return discount;
    }
}
