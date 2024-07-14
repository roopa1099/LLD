public class Floor {
    int floorNumber;
    ExternalButtonPanel externalButtonPanel = new ExternalButtonPanel();

    void pressButton(DirectionEnum directionEnum) {
        externalButtonPanel.pressButton(floorNumber, directionEnum);
    }
}
