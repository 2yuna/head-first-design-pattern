package headfirst.designpatterns.combining.factory;

import headfirst.designpatterns.combining.ducks.Quackable;

public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCallDuck();
    public abstract Quackable createRubberDuck();

    public abstract Quackable createGooseDuck();

}
