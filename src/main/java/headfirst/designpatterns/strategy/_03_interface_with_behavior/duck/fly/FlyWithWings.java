package headfirst.designpatterns.strategy._03_interface_with_behavior.duck.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날고 있어요!!");
    }
}
