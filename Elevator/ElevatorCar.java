public class ElevatorCar {
    Display display;
    InternalButtonPanel internalButtonPanel = new InternalButtonPanel();
    int currentFloor;
    DirectionEnum direction;
    MovementStatus movementStatus;

    public ElevatorCar() {
        this.movementStatus = MovementStatus.STOP;
        this.direction = DirectionEnum.NULL;
        this.currentFloor = 0;

    }

    void moveUp() {
        this.direction = DirectionEnum.UP;
    }

    void moveDown() {
        this.direction = DirectionEnum.DOWN;
    }

    void stopCar() {
        this.movementStatus = MovementStatus.STOP;
    }

    void moveCar() {
        this.movementStatus = MovementStatus.MOVE;
    }

    void setCurrenFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    void pressButton(int floor) {
        DirectionEnum directionEnum;
        if (floor < currentFloor) {
            directionEnum = DirectionEnum.DOWN;
        } else {
            directionEnum = DirectionEnum.UP;
        }
        internalButtonPanel.pressButton(floor, directionEnum);
    }

    // setter
    // getter
}
