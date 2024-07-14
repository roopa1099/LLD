
public class ElevatorCarController {
    ElevatorCar elevatorCar;
    int id;

    public ElevatorCarController(int currentFloor) {
        this.elevatorCar = new ElevatorCar();
    }

    public void onRequest(Request request) {
        ElevatorManager.elevatorControllerStrategy.pendingRequest.add(request);
        moveElevator();
    }

    void moveElevator() {
        ElevatorManager.elevatorControllerStrategy.moveElevator(this);
    }

}
