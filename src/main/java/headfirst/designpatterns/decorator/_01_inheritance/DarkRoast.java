package headfirst.designpatterns.decorator._01_inheritance;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "최고의 다크 로스트 커피";
    }

    @Override
    public double cost() {
        return 1.99 + super.cost();
    }
}
