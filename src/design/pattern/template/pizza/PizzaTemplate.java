package design.pattern.template.pizza;

import design.pattern.template.pizza.HawaiiPizza;
import design.pattern.template.pizza.PepperoniPizza;

/**
 * This class serves as a template for the algorithm of making a pizza.
 *
 * @author bruno.alexandre@diconium.com
 */
public abstract sealed class PizzaTemplate permits HawaiiPizza, PepperoniPizza {

    /**
     * Method responsible for making a pizza
     */
    public final void makePizza() {
        preparePizzaDough();
        addSauce();
        addToppings();
    }

    /**
     * Prepare the pizza dough
     */
    protected void preparePizzaDough() {
        System.out.println("The pizza dough is ready...");
    }

    /**
     * Will add the pizza sauce
     */
    protected void addSauce() {
        System.out.println("Some tomato sauce was added...");
    }

    /**
     * Add the pizza toppings
     */
    protected abstract void addToppings();

}
