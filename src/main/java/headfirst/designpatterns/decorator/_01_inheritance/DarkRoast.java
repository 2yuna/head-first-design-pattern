package headfirst.designpatterns.decorator._01_inheritance;

public class DarkRoast extends Beverage {

    private static final double DARK_ROAST_COST = 2000;

    public DarkRoast() {
        description = "최고의 다크 로스트 커피";
    }

    @Override
    public double cost() {
        return super.cost() + DARK_ROAST_COST;
    }
}
