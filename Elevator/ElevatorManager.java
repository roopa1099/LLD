import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ElevatorManager {

    public static ElevatorManager instance = new ElevatorManager();
    public static List<ElevatorCarController> controllers = new ArrayList<>();
    public static ElevatorControllerStrategy elevatorControllerStrategy;
    public static ElevatorSelectorStrategy elevatorSelectorStrategy;
    // strategy;

    // setter getter fpr strategies.
    private ElevatorManager() {

    }

    static ElevatorManager getInstance() {
        return instance;
    }

    void onReceiveRequest(Request request) {
        int elevatorId = this.elevatorSelectorStrategy.selectElevator(request.targetFloor, request.directionToMove);
        ElevatorCarController elevatorCarController = controllers.stream()
                .findFirst((ElevatorCarController carController) -> carController.elevatorCar.id == elevatorId);
        elevatorCarController.onRequest(request);
    }

}
