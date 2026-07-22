class Payment {
    void pay() {
        System.out.println("Processing payment...");
    }
}

class CreditCard extends Payment {
    @Override
    void pay() {
        System.out.println("Payment using Credit Card");
    }
}

class UPI extends Payment {
    @Override
    void pay() {
        System.out.println("Payment using UPI");
    }
}

public class Main {
    public static void main(String[] args) {

        Payment p1 = new CreditCard();
        Payment p2 = new UPI();

        p1.pay();
        p2.pay();
    }
}
