package headfirst.designpatterns.factory._02_ingredients;

import headfirst.designpatterns.factory._02_ingredients.store.NYPizzaStore;
import headfirst.designpatterns.factory._02_ingredients.store.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");


    }
}
