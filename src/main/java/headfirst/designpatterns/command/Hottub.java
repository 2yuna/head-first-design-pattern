package headfirst.designpatterns.command;

public class Hottub {

    String name;

    public Hottub() {
    }

    public Hottub(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("욕조에 온수를 틉니다.");
    }

    public void off() {
        System.out.println("욕조에 온수를 끕니다.");
    }
}
