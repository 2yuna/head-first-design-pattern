package headfirst.designpatterns.factory._02_ingredients.pizza.ingredients;

import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.cheese.Cheese;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.cheese.MozzarellaCheese;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.clams.Clams;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.clams.FrozenClam;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.dough.Dough;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.dough.ThickCrustDough;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.pepperoni.Pepperoni;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.pepperoni.SlicedPepperoni;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.sauce.PlumTomatoSauce;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.sauce.Sauce;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.veggie.BlackOlives;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.veggie.EggPlant;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.veggie.Spinach;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.veggie.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Spinach(), new BlackOlives(), new EggPlant() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClam();
    }
}
