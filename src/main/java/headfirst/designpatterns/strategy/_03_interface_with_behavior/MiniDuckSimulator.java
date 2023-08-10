package headfirst.designpatterns.strategy._03_interface_with_behavior;

import headfirst.designpatterns.strategy._03_interface_with_behavior.duck.Duck;
import headfirst.designpatterns.strategy._03_interface_with_behavior.duck.MallardDuck;
import headfirst.designpatterns.strategy._03_interface_with_behavior.duck.ModelDuck;
import headfirst.designpatterns.strategy._03_interface_with_behavior.duck.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
