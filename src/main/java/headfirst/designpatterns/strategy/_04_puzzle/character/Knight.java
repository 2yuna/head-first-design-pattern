package headfirst.designpatterns.strategy._04_puzzle.character;

import headfirst.designpatterns.strategy._04_puzzle.character.weapon.KnifeBehavior;

public class Knight extends Character {
    public Knight() {
        weapon = new KnifeBehavior();
    }
}
