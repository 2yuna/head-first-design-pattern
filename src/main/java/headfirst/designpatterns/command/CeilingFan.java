package headfirst.designpatterns.command;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("거실 선풍기 속도가 HIGH으로 설정되었습니다");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("거실 선풍기 속도가 MEDIUM으로 설정되었습니다");
    }

    public void low() {
        speed = LOW;
    }

    public void off() {
        speed = OFF;
        System.out.println("거실 선풍기가 꺼졌습니다");
    }

    public int getSpeed() {
        return speed;
    }
}
