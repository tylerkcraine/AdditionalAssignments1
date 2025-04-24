package DefaultInterfaces;

public class Main {
    public static void main(String[] args) {
        RegularCustomer regularCustomer = new RegularCustomer(100);
        PrivilegedCustomer privilegedCustomer = new PrivilegedCustomer(100);

        System.out.println("Both customers have carts of 100 dollars");
        System.out.println("Regular customer purchase total: " + regularCustomer.calculatePurchaseAmount());
        System.out.println("Privileged customer purchase total: " + privilegedCustomer.calculatePurchaseAmount());
    }
}
