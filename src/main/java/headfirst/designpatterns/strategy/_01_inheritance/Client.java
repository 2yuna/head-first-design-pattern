package headfirst.designpatterns.strategy._01_inheritance;

public class Client {

    public static void main(String[] args) {
        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.quack();
        decoyDuck.fly();

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.quack();
        redHeadDuck.fly();
    }
}