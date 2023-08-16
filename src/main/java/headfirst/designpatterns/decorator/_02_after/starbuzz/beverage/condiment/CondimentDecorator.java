package headfirst.designpatterns.decorator._02_after.starbuzz.beverage.condiment;

import headfirst.designpatterns.decorator._02_after.starbuzz.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

    public Beverage beverage;

    public abstract String getDescription();

    public Size getSize() {
        return beverage.getSize();
    }

}
