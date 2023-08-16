package headfirst.designpatterns.decorator._02_after.starbuzz.beverage;

public abstract class Beverage {

    public enum Size { TALL, GRANDE, VENTI };

    Size size = Size.TALL;
    String description = "Unknown Beverage";

    public abstract double cost();

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }
}
