package ObserverPattern.Observable;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

import ObserverPattern.Observer.Observers;

/**
 * Weather station
 * StockNotification
 * Any type of notification
 */
interface Observable {
    public void add(Observer observer);
    public void remove(Observer observer);
    public void notifyMethod();
    public void restocked(int quantity);

}

class BewakoofTop implements Observable {
    int quantity
    List<Observer> subscribers = new ArrayList()

    @Override
    public void add(Observer observer) {
        // TODO Auto-generated method stub
        subscribers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        // TODO Auto-generated method stub
       subscribers.remove(observer);
    }

    @Override
    public void notifyMethod() {
        // TODO Auto-generated method stub
        for(Observer observer : subscribers) {
            observer.update();
        }
    }

    @Override
    public void restocked(int quantity) {
        // TODO Auto-generated method stub
        this.quantity+=quantity;
        notify();
    }

}

class DenimJacket implements Observable {
    int quantity=0;
    List<Observer> subscribers = new ArrayList()

    @Override
    public void add(Observer observer) {
        // TODO Auto-generated method stub
        subscribers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        // TODO Auto-generated method stub
       subscribers.remove(observer);
    }

    @Override
    public void notifyMethod() {
        // TODO Auto-generated method stub
        for(Observer observer : subscribers) {
            observer.update();
        }
    }

    @Override
    public void restocked(int quantity) {
        // TODO Auto-generated method stub
        this.quantity+=quantity;
        notify();
    }

}



public class Observables {
    
}
