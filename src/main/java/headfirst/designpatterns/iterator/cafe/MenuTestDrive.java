package headfirst.designpatterns.iterator.cafe;

public class MenuTestDrive {
    public static void main(String[] args) {
        Waitress waitress = new Waitress(
                new PancakeHouseMenu(),
                new DinerMenu(),
                new CafeMenu()
        );

        waitress.printMenu();
    }
}