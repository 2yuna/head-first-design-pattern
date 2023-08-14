package headfirst.designpatterns.decorator._02_after.beverage;

public abstract class Beverage {

    String description = "Unknown Beverage";

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
