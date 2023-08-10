package headfirst.designpatterns.strategy._01_inheritance;

public abstract class Duck {

    void quack() {
        System.out.println("꽥꽥");
    }

    void swim() {
        System.out.println("수영");
    }

    void fly() {
        System.out.println("날기");
    }

    abstract void display();

}
