package headfirst.designpatterns.command;

public class Tv {

    String name;

    public Tv() {
    }

    public Tv(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("Tv가 켜졌습니다.");
    }

    public void off() {
        System.out.println("Tv가 꺼졌습니다.");
    }
}
