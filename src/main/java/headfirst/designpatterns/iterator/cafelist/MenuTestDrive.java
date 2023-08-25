package headfirst.designpatterns.iterator.cafelist;

import java.util.List;

public class MenuTestDrive {
    public static void main(String[] args) {
        Waitress waitress = new Waitress(
                List.of(new PancakeHouseMenu(),
                        new DinerMenu(),
                        new CafeMenu())
        );

        waitress.printMenu();
    }
}