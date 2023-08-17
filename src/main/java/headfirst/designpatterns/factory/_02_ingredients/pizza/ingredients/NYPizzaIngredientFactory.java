package headfirst.designpatterns.factory._02_ingredients.pizza.ingredients;

import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.cheese.Cheese;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.cheese.ReggianoCheese;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.clams.Clams;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.clams.FreshClam;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.dough.Dough;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.dough.ThinCrustDough;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.pepperoni.Pepperoni;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.pepperoni.SlicedPepperoni;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.sauce.MarinaraSauce;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.sauce.Sauce;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.veggie.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClam();
    }
}
