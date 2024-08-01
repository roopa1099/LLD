package BookMyShow;

enum PaymentMode {
    UPI,
    CREDIT_CARD
}

class PaymentStrategy {
    Payment paymentMode;

    public PaymentStrategy(PaymentMode payment) {
        if (payment == PaymentMode.UPI) {
            this.paymentMode = new UPIStrategy();
        } else {
            this.paymentMode = new CreditCardStrategy();
        }

    }

    void payAmount() {
        paymentMode.paymentStatus();
    }
}

public interface Payment {

    public void paymentStatus();
}

class UPIStrategy implements Payment {

    @Override
    public void paymentStatus() {
        // TODO Auto-generated method stub
        //
    }

}

class CreditCardStrategy implements Payment {

    @Override
    public void paymentStatus() {
        // TODO Auto-generated method stub
        //
    }

}
