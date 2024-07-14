package CarRental;

import java.util.Date;
import java.util.List;

interface IRentalManagementSystem {
    void registerUser(User user);

    void registerStore(Store store);

    void registerVehicleToStore(int StoreId, Vehicle vehicle);

    List<Store> listAllStores(Location location);

    Reservation bookVehicle(Store store, User user, Vehicle vehicle, Date bookingFrom, Date bookingTill,
            ChargeType chargeType);

    PaymentStatus payAmount(float totalAmountm, PaymentTpe paymentTpe);

    void submitVehicle(Store store, Vehicle vehicle, Reservation reservation);
}

public class RentalManagementSystem implements IRentalManagementSystem {
    List<User> users;
    List<Store> stores;

    @Override
    public void registerUser(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerUser'");
    }

    @Override
    public void registerStore(Store store) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerStore'");
    }

    @Override
    public void registerVehicleToStore(int StoreId, Vehicle vehicle) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerVehicleToStore'");
    }

    @Override
    public List<Store> listAllStores(Location location) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listAllStores'");
    }

    @Override
    public Reservation bookVehicle(Store store, User user, Vehicle vehicle, Date bookingFrom, Date bookingTill,
            ChargeType chargeType) {
        store.reserveVehicle(vehicle, user, bookingFrom, bookingTill, chargeType);
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bookVehicle'");
    }

    @Override
    public PaymentStatus payAmount(float totalAmount, PaymentTpe paymentTpe) {
        PaymentStrategy paymentStrategy = new PaymentStrategy(paymentTpe);
        return paymentStrategy.payAmount(totalAmount);
    }

    @Override
    public void submitVehicle(Store store, Vehicle vehicle, Reservation reservation) {
        if (reservation.paymentStatus == PaymentStatus.NOT_PAID) {
            // not paid
        }
        // add vehicle to store inventory
        // reservation can be removed from store list

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'submitVehicle'");
    }

}
