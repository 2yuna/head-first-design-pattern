package headfirst.designpatterns.strategy._01_inheritance;

public class DecoyDuck extends Duck {

    @Override
    void quack() {

    }

    @Override
    void fly() {

    }

    @Override
    void display() {
        System.out.println("나무로 된");
    }
}
