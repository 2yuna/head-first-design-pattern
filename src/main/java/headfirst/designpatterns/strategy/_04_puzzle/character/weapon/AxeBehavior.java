package headfirst.designpatterns.strategy._04_puzzle.character.weapon;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("도끼로 찍는다");
    }
}
