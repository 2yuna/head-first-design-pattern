package headfirst.designpatterns.strategy._03_interface_with_behavior.duck.quack;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }
}
