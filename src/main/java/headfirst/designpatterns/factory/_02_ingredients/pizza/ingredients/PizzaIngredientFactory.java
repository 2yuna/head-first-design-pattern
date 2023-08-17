package headfirst.designpatterns.factory._02_ingredients.pizza.ingredients;

import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.cheese.Cheese;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.clams.Clams;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.dough.Dough;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.pepperoni.Pepperoni;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.sauce.Sauce;
import headfirst.designpatterns.factory._02_ingredients.pizza.ingredients.veggie.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();

}
