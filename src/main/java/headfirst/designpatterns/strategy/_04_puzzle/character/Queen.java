package headfirst.designpatterns.strategy._04_puzzle.character;

import headfirst.designpatterns.strategy._04_puzzle.character.weapon.BowAndArrowBehavior;

public class Queen extends Character {
    public Queen() {
        weapon = new BowAndArrowBehavior();
    }
}
