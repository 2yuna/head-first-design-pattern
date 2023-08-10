package headfirst.designpatterns.strategy._04_puzzle.character.weapon;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("화살을 쏜다");
    }
}
