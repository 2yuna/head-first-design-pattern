package headfirst.designpatterns.facade.hometheater;

public class Amplifier {

    String description;
    Tuner tuner;
    StreamingPlayer player;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        System.out.println(description + " setting Streaming player to " + player);
        this.player = player;
    }

    public void setStereoSound() {
        System.out.println(description + " stereo mode on");
    }

    public void setSurroundSound() {
        System.out.println(description + " surround sound on (5 speakers, 1 subwoofer");
    }

    public void setTuner(Tuner tuner) {
        System.out.println(description + " setting tuner to " + player);
        this.tuner = tuner;
    }

    public void setVolume(int volume) {
        System.out.println(description + " setting volume to " + volume);
    }

    public String toString() {
        return description;
    }
}