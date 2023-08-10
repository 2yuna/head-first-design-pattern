package headfirst.designpatterns.strategy._03_interface_with_behavior.duck.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("저는 못 날아요");
    }
}
