package ParkingArea;

enum VehicleType {
    TWO_WHEELER,
    FOUR_WHEELER
}

public abstract class Vehicle {
    int registration_number;
    VehicleType type;
    long baseAmount;
    
}


class Bike extends Vehicle {

    public Bike(int registration_number) {
        this.registration_number = registration_number;
        this.type = VehicleType.TWO_WHEELER;
        this.baseAmount = 10;
    }
}

class Car extends Vehicle {
    public Car(int registration_number) {
        this.registration_number = registration_number;
        this.type = VehicleType.FOUR_WHEELER;
        this.baseAmount = 30;
    }
}
