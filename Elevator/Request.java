public class Request {

    DirectionEnum directionToMove;
    int targetFloor;

    public Request(DirectionEnum directionEnum, int targetFloor) {
        this.targetFloor = targetFloor;
        this.directionToMove = directionEnum;
    }
}
