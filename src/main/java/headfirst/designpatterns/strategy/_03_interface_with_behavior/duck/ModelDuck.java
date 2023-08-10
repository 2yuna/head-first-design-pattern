package headfirst.designpatterns.strategy._03_interface_with_behavior.duck;


import headfirst.designpatterns.strategy._03_interface_with_behavior.duck.fly.FlyNoWay;
import headfirst.designpatterns.strategy._03_interface_with_behavior.duck.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("저는 모형 오리입니다");
    }
}
