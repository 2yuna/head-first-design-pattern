package headfirst.designpatterns.strategy._01_inheritance;

public class RubberDuck extends Duck {

    @Override
    void quack() {
        System.out.println("삑삑");
    }

    @Override
    void fly() {

    }

    @Override
    void display() {
        System.out.println("고무로 된");
    }
}
