package ParkingArea;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ParkingSpotManager {

    List<CarParkingSpot> carParkingSpot = new ArrayList<>(); 
    List<BikeParkingSpot> bikeParkingSpot= new ArrayList<>();


    void initialize() {
        // add parking spots
        // manage nearest to gate 
    }

    Ticket onEntrance(Vehicle vehicle, EntranceGate gate) {
        ParkingSpot parking_spot = gate.findParkingSpot(vehicle.type);
        
        if(vehicle.type == VehicleType.FOUR_WHEELER) {
                if(carParkingSpot.size() == 0) {
                    // no space
                }
        }
        else{

            if(bikeParkingSpot.size() == 0) {
                // no space
            }
        }

        parking_spot.isAvailable = false;
        parking_spot.vehicleNumber = vehicle.registration_number;
        // add in list
        return generateTicket(vehicle.registration_number,parking_spot.parking_spot_id, vehicle.baseAmount);
    }

    void onExit(Ticket ticket, VehicleType vehicleType, CostType costType, PaymentStrategyType paymentStrategyType) {

        long currentTime = System.currentTimeMillis();

        CostStrategyFactory costStrategy = new CostStrategyFactory(vehicleType);
        // add base amount
        double totalAmount = costStrategy.calculateCost(currentTime-ticket.occupiedFrom, costType, 876876);
        Payment payment = new Payment(paymentStrategyType);
        System.out.println("Amount = "+totalAmount);
        // find the parking spot based on id and update is available and vehicle number
        payment.makePayment(totalAmount);
    }


    private Ticket generateTicket(int registration_number, int parking_spot_id, long baseAmount) {
        Ticket ticket = new Ticket(registration_number, parking_spot_id,  baseAmount);
        return ticket;
    }
    
}
