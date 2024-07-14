import java.util.LinkedList;
import java.util.Queue;

public interface ElevatorControllerStrategy {
    Queue<Request> pendingRequest = new LinkedList<>();

    void moveElevator(ElevatorCarController elevatorCarController);

}

class FirstComeFirstServeStrategy implements ElevatorControllerStrategy {

    @Override
    public void moveElevator(ElevatorCarController elevatorCarController) {

    }

}

class ScanStrategy implements ElevatorControllerStrategy {

    @Override
    public void moveElevator(ElevatorCarController elevatorCarController) {

    }

}

class LookAlgorithm implements ElevatorControllerStrategy {

    @Override
    public void moveElevator(ElevatorCarController elevatorCarController) {

    }

}