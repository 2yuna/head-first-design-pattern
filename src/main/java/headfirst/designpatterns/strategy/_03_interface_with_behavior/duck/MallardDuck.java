package headfirst.designpatterns.strategy._03_interface_with_behavior.duck;


import headfirst.designpatterns.strategy._03_interface_with_behavior.duck.fly.FlyWithWings;
import headfirst.designpatterns.strategy._03_interface_with_behavior.duck.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("물에 사는 오리");
    }
}
