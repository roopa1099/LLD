package CarRental;

import java.util.Date;

enum ChargeType {
    HOURLY,
    MINUTES
}

public class Reservation {
    String reservationId;
    Vehicle vehicle;
    User user;
    Date bookingFrom;
    Date bookingTill;
    ChargeType chargeType;
    PaymentStatus paymentStatus;

    public Reservation(Vehicle vehicle, User user, Date bookingFrom, Date bookingTill, ChargeType chargeType) {
        this.vehicle = vehicle;
        this.user = user;
        this.bookingFrom = bookingFrom;
        this.bookingTill = bookingTill;
        this.chargeType = chargeType;
        paymentStatus = PaymentStatus.NOT_PAID;
    }
}
