//Decorator class uses has-a and is-a relationship with bae class.
// is-a relation ship is when you extend a class
// This pattern can be used when you have a base class and you need to add decoration, like toppings on pizza, coffee, etc.
// Used to avoid class explosion, by combining different toppings together.

abstract class BasePizza {

    int cost();
}

class Margeritta extends BasePizza {
    @Override
    int cost() {
        return 200;
    }
}
class Veg extends BasePizza { //types of base pizza
    @Override
    int cost() {
        return 240;
    }
}

abstract class ToppingOnPizza extends BasePizza { //decorator class is-a and has-a relation


}

class MushroomTopping extends ToppingOnPizza {
    BasePizza pizza;

    public MushroomTopping(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    int cost() {
        return pizza.cost() + 10;
    }
}

class ExtraCheese extends ToppingOnPizza {
    BasePizza pizza;

    public ExtraCheese(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    int cost() {
        return pizza.cost() + 20;
    }
}

public class Example {
    
}
