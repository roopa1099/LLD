package ParkingArea;

public  class Ticket {
   int ticketNumber;
   long occupiedFrom;
   int registration_number;
   int parking_spot_id;
   long baseAmount;


   public Ticket(int registration_number, int parking_spot_id, long baseAmount){
        // this.ticketNumber = generateUUID();
        this.occupiedFrom = System.currentTimeMillis();
        this.registration_number = registration_number;
        this.parking_spot_id = parking_spot_id;
        this.baseAmount=baseAmount
   }


}
