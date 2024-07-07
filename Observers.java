package ObserverPattern.Observer;

import ObserverPattern.Observable.Observables;

interface Observer {
    void update();
}

class DenimUser implements Observer{

    Observable observable

    public DenimUser() {
        this.observable= new DenimJacket();
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        System.out.println("DenimJacket available : "+observable.quantity);
    }
    
}


class BewakoofTopUser implements Observer{

    Observable observable

    public BewakoofTopUser() {
        this.observable= new BewakoofTop();
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        System.out.println("Bewakoof Top available : "+observable.quantity);
    }
    
}


public class Observers {
    
}
