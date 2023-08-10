package headfirst.designpatterns.strategy._04_puzzle.character;

import headfirst.designpatterns.strategy._04_puzzle.character.weapon.AxeBehavior;

public class Troll extends Character {
    public Troll() {
        weapon = new AxeBehavior();
    }
}
