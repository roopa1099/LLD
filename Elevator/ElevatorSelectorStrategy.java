import java.util.List;

public interface ElevatorSelectorStrategy {
    List<ElevatorCarController> elevatorCarControllerList = ElevatorManager.controllers;

    int selectElevator(int floor, DirectionEnum directionEnum);
}

class OddEvenStrategy implements ElevatorSelectorStrategy {

    @Override
    public int selectElevator(int floor, DirectionEnum directionEnum) {
        // old elevator for odd floors and even elevators for even floors
        // select elevator which is moving in same direction which is requested or IDLE
        // elevator
        // if(floor%2 == eController.getId()%2)
        // {
        // int currFloor= eController.getElevatorCar().getCurrentFloor();
        // Direction currDir= eController.getElevatorCar().getDir();
        // if(floor>currFloor && currDir==Direction.UP)
        // return eController.getId();
        // else if(floor<currFloor && currDir==Direction.DOWN)
        // return eController.getId();
        // else if(currDir==Direction.NONE)
        // return eController.getId();
        //
        // }
        return 0;
    }

}

class ZoneStrategy implements ElevatorSelectorStrategy {

    @Override
    public int selectElevator(int floor, DirectionEnum directionEnum) {
        return 0;
    }

}