package headfirst.designpatterns.strategy._03_interface_with_behavior.duck.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< 조용~ >>");
    }
}
