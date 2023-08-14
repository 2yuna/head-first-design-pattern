package headfirst.designpatterns.decorator._01_inheritance;

public abstract class Beverage {

    protected String description;
    protected boolean milk;
    protected boolean soy;
    protected boolean mocha;
    protected boolean chip;

    public double cost() {
        double totalCost = 0;
        totalCost += hasMilk() ? 1200 : 0;
        totalCost += hasSoy() ? 1800 : 0;
        totalCost += hasMocha() ? 500 : 0;
        totalCost += hasChip() ? 300 : 0;
        return totalCost;
    }

    public String getDescription() {
        return description;
    }

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean hasChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }
}
