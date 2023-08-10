package headfirst.designpatterns.strategy._03_interface_with_behavior.duck.quack;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑삑");
    }
}
