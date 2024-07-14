package CarRental;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventory {
    private List<Vehicle> vehicleList = new ArrayList<>();

    void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);

    }

    Vehicle getVehicle(String registraionNumer) {
        // find and return vehicle
        return new Vehicle();
    }

    List<Vehicle> listAllVehicles() {
        return vehicleList;
    }

    void removeVehicle(String registrationNumber) {
        // remove from list;
    }

}

/**
 * If required can be divided into bikeInventory and carInventory
 */
