package ParkingArea;

public abstract class Gate {
    int gate_number;

    public Gate(int gate_number) {
        this.gate_number = gate_number;
    }

    public abstract void updateParkingSpot();
}

class EntranceGate extends Gate {
    //Heap to store nearest spots, w.r.t gates

    public EntranceGate(int gate_number) {
        super(gate_number);
    }

    /////////
    public ParkingSpot findParkingSpot(VehicleType vehicleType) {
        return null;
    }

    public void printTicket( int registration_number, int parking_spot_id) {
        Ticket ticket = new Ticket(registration_number,parking_spot_id);
        System.out.println("Collect your ticket : " + ticket);
    }
///// parking spot manager work
    @Override
    public void updateParkingSpot() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateParkingSpot'");
    }
    
}


class ExitGate extends Gate {


    public ExitGate(int gate_number) {
        super(gate_number);
    }
   //////
    public int calculateCost(Ticket ticket) {
        return 1;
    }


    public void payAmount(long amoun, PaymentStrategyType paymentStrategyType) {
        Payment paymentStrategy = new Payment(paymentStrategyType);
        paymentStrategy.makePayment(amoun);
    }
    @Override
    public void updateParkingSpot() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateParkingSpot'");
    }
    
}