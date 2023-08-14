package headfirst.designpatterns.decorator._02_after;

import headfirst.designpatterns.decorator._02_after.beverage.Beverage;
import headfirst.designpatterns.decorator._02_after.beverage.DarkRoast;
import headfirst.designpatterns.decorator._02_after.beverage.Espresso;
import headfirst.designpatterns.decorator._02_after.beverage.HouseBlend;
import headfirst.designpatterns.decorator._02_after.beverage.condiment.Mocha;
import headfirst.designpatterns.decorator._02_after.beverage.condiment.Soy;
import headfirst.designpatterns.decorator._02_after.beverage.condiment.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}