package headfirst.designpatterns.decorator._02_after.beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "디카페인 커피";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
