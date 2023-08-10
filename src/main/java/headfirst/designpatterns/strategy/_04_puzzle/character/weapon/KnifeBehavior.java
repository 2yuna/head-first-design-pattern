package headfirst.designpatterns.strategy._04_puzzle.character.weapon;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("칼로 벤다.");
    }
}
