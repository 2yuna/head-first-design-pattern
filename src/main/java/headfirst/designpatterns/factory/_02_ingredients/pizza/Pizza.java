package headfirst.designpatterns.factory._02_ingredients.pizza;

import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.cheese.Cheese;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.clams.Clams;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.dough.Dough;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.pepperoni.Pepperoni;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.sauce.Sauce;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.veggie.Veggies;

public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    public void bake() {
        System.out.println("175도에서 25분 간 굽기");
    }

    public void cut() {
        System.out.println("피자를 사선으로 자르기");
    }

    public void box() {
        System.out.println("상자에 피자 담기");
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}