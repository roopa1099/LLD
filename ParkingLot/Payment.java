package ParkingArea;

enum PaymentStrategyType {
    CREDIT_CARD,
    CASH,
    UPI
}
////Check Strategy Pattern
public class Payment {

    PaymentStrategy paymentStrategy;

    public Payment (PaymentStrategyType paymentStrategyType){
        if(paymentStrategyType == PaymentStrategyType.CREDIT_CARD){
            this.paymentStrategy = new CreditCardStrategy();
        }
        else if(paymentStrategyType == PaymentStrategyType.UPI) {
            this.paymentStrategy = new UPIStrategy();
        }
        else{
            this.paymentStrategy = new CashStartegy();
        }
    }

    public void makePayment(double amoount) {
            paymentStrategy.makePayment(amoount);
    }

    
}

interface PaymentStrategy {
     void makePayment(double amount);
}
class CreditCardStrategy implements PaymentStrategy{

    @Override
    public void makePayment(double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makePayment'");
    }
    
}


class UPIStrategy implements PaymentStrategy{

    @Override
    public void makePayment(double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makePayment'");
    }

}

class CashStartegy implements PaymentStrategy{

    @Override
    public void makePayment(double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makePayment'");
    }

}
