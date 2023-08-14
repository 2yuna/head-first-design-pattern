package headfirst.designpatterns.decorator._02_after.beverage.condiment;

import headfirst.designpatterns.decorator._02_after.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    public abstract String getDescription();

}
