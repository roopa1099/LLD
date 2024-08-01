package BookMyShow;

import java.util.List;

public class BookingDetail {
    Show show;
    List<Seat> seatSelected;

    public BookingDetail(Show show, List<Seat> seats) {
        this.show = show;
        this.seatSelected = seats;
    }

    float calculateCost() {
        // algorithm for cost valvculation
        return 1;
    }
}
