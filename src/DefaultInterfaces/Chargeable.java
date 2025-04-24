package DefaultInterfaces;

public interface Chargeable {
    default double chargeOnDelivery() {
        return 1.0;
    }
}
