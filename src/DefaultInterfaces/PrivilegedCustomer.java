package DefaultInterfaces;

public class PrivilegedCustomer extends Customer{
    static double discount = 0.95;

    public PrivilegedCustomer(double cartTotal) {
        super(cartTotal);
    }

    @Override
    public double chargeOnDelivery() {
        return discount;
    }
}
