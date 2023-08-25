package headfirst.designpatterns.iterator.iterator;

public class MenuTestDrive {
    public static void main(String[] args) {
        Waitress waitress = new Waitress(
                new PancakeHouseMenu(),
                new DinerMenu()
        );

        waitress.printMenu();
    }
}