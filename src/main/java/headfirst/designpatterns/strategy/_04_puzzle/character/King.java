package headfirst.designpatterns.strategy._04_puzzle.character;

import headfirst.designpatterns.strategy._04_puzzle.character.weapon.SwordBehavior;

public class King extends Character {
    public King() {
        weapon = new SwordBehavior();
    }
}
