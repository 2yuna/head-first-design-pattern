package headfirst.designpatterns.strategy._02_interface;

public abstract class Duck {
    void swim() {
        System.out.println("수영을 할 수 있다.");
    }

    abstract void display();
}
