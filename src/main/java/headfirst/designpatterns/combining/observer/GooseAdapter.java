package headfirst.designpatterns.combining.adapter;

import headfirst.designpatterns.combining.ducks.Quackable;

public class GooseAdapter implements Quackable {

    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
