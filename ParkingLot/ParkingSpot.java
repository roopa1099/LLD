package ParkingArea;

enum CostType {
        HOURLY,
        MIN

}

public abstract class ParkingSpot {
    int parking_spot_id;
    int vehicleNumber;
    VehicleType parkVehicleType;
    boolean isAvailable;
    long basicCost;
    CostType costType;

    public ParkingSpot(long basicCost, VehicleType vehicleType){
        this.parkVehicleType = vehicleType;
        this.basicCost = basicCost;
    }
    
}

class CarParkingSpot extends ParkingSpot {

    public CarParkingSpot() {
            super(40, VehicleType.FOUR_WHEELER);
    }
}

class BikeParkingSpot extends ParkingSpot {
    public BikeParkingSpot() {
        super(20, VehicleType.TWO_WHEELER);
    }
}