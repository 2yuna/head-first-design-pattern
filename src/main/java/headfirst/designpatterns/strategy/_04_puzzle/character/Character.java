package headfirst.designpatterns.strategy._04_puzzle.character;

import headfirst.designpatterns.strategy._04_puzzle.character.weapon.WeaponBehavior;

public abstract class Character {

    WeaponBehavior weapon;

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
