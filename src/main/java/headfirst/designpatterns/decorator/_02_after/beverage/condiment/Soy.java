package headfirst.designpatterns.decorator._02_after.beverage.condiment;

import headfirst.designpatterns.decorator._02_after.beverage.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }
}
