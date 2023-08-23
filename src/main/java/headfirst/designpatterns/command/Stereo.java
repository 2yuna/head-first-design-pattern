package headfirst.designpatterns.command;

public class Stereo {

    public void on() {
        System.out.println("on");
    }

    public void off() {
        System.out.println("off");
    }

    public void setCd() {
        System.out.println("setCd");
    }

    public void setDvd() {
        System.out.println("setDvd");
    }

    public void setVolume(int i) {
        System.out.println("setVolume");
    }
}
