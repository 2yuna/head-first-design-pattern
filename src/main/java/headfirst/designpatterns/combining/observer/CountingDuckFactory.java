package headfirst.designpatterns.combining.factory;

import headfirst.designpatterns.combining.adapter.Goose;
import headfirst.designpatterns.combining.adapter.GooseAdapter;
import headfirst.designpatterns.combining.decorator.QuackCounter;
import headfirst.designpatterns.combining.ducks.*;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCallDuck() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    @Override
    public Quackable createGooseDuck() {
        return new GooseAdapter(new Goose());
    }
}
