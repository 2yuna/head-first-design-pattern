package headfirst.designpatterns.strategy._04_puzzle.character.weapon;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("검을 휘두른다.");
    }
}
