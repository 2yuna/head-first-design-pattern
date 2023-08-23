package headfirst.designpatterns.command;

public class Stereo {

    String name;

    public Stereo() {
    }

    public Stereo(String name) {
        this.name = name;
    }

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
