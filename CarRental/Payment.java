package CarRental;

enum PaymentTpe {
    CREDIT_CARD,
    UPI
}

enum PaymentStatus {
    SUCCESS,
    FAILURE,
    NOT_PAID
}

public abstract class Payment {

    abstract PaymentStatus payAmount(float amount);

}

class CreditCard extends Payment {

    @Override
    PaymentStatus payAmount(float amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'payAmount'");
    }

}

class UPIPayment extends Payment {

    @Override
    PaymentStatus payAmount(float amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'payAmount'");
    }

}

class PaymentStrategy {
    Payment payment;

    public PaymentStrategy(PaymentTpe paymentTpe) {
        if (paymentTpe == PaymentTpe.CREDIT_CARD) {
            this.payment = new CreditCard();
        } else {
            this.payment = new UPIPayment();
        }
    }

    public PaymentStatus payAmount(float totalAmount) {
        return payment.payAmount(totalAmount);
    }
}
