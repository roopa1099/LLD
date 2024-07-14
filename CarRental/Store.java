package CarRental;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * Since only once class is having the functionality hence o interface is made or created
 */
public class Store {
    VehicleInventory vehicleInventory;
    Location location;
    int storeId;
    List<Reservation> reservations;

    public Store(Location location) {
        this.vehicleInventory = new VehicleInventory();
        this.location = location;
        // this.storeId = generateStoreId();
        this.reservations = new ArrayList<>();
    }

    List<Vehicle> listAllVehicles(String filter) {
        // apply filter below
        return this.vehicleInventory.listAllVehicles();
    }

    void reserveVehicle(Vehicle vehicle, User user, Date bookingFrom, Date bookingTill, ChargeType chargeType) {
        reservations.add(new Reservation(vehicle, user, bookingFrom, bookingTill, chargeType));
    }

}
