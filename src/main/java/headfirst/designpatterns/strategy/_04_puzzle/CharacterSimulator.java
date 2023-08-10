package headfirst.designpatterns.strategy._04_puzzle;

import headfirst.designpatterns.strategy._04_puzzle.character.Character;
import headfirst.designpatterns.strategy._04_puzzle.character.Queen;
import headfirst.designpatterns.strategy._04_puzzle.character.weapon.BowAndArrowBehavior;

public class CharacterSimulator {
    public static void main(String[] args) {
        Character queen = new Queen();
        queen.setWeapon(new BowAndArrowBehavior());
        queen.fight();
    }
}
