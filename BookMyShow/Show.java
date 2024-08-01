package BookMyShow;

import java.sql.Time;
import java.util.List;

public class Show {
    int id;
    Movie movie;
    Time start_time;
    Screen screen;
    List<Seat> reserved_seats;
}
