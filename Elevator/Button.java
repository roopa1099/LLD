public abstract class Button {
    int floor;

    abstract void pressButton(int floor, DirectionEnum direction);
}

class InternalButtonPanel extends Button {
    InternalDispatcher internalDispatcher = new InternalDispatcher();

    @Override
    void pressButton(int floor, DirectionEnum directionEnum) {
        // TODO Auto-generated method stub
        internalDispatcher.sendRequest(floor, directionEnum);
    }

}

class ExternalButtonPanel extends Button {
    ExternalDispatcher dispatcher = new ExternalDispatcher();

    @Override
    void pressButton(int floor, DirectionEnum directionEnum) {
        dispatcher.sendRequest(floor, directionEnum);
    }

}

interface Dispatcher {
    void sendRequest(int floor, DirectionEnum directionEnum);
}

class InternalDispatcher implements Dispatcher {

    @Override
    public void sendRequest(int floor, DirectionEnum directionEnum) {
        ElevatorManager.getInstance().onReceiveRequest(new Request(directionEnum, floor));
    }

}

class ExternalDispatcher implements Dispatcher {

    @Override
    public void sendRequest(int floor, DirectionEnum directionEnum) {
        ElevatorManager.getInstance().onReceiveRequest(new Request(directionEnum, floor));
    }

}