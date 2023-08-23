package headfirst.designpatterns.singleton._03_after;

public class Client {
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.INSTANCE;
        chocolateBoiler.boil();
    }
}
