package headfirst.designpatterns.strategy._01_inheritance;

public class RedHeadDuck extends Duck {
    @Override
    void display() {
        System.out.println("빨간 머리 오리");
    }
}
