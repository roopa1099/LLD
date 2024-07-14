package CarRental;

public class Bill {
    Reservation reservation;
    float totalAmount;

    public Bill(Reservation reservation) {
        this.reservation = reservation;
        calculateTotalCharge();
    }

    public void generatBill() {
    }

    private float calculateTotalCharge() {
        totalAmount = 100;
        return totalAmount;
    }

}
