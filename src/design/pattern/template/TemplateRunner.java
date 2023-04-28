package design.pattern.template;

import design.pattern.template.pizza.HawaiiPizza;
import design.pattern.template.pizza.PepperoniPizza;

/**
 * Class that will run the pizza program
 */
public class TemplateRunner {

    public static void main(String... args) {

        System.out.println("Making the Peperoni pizza....");
        new PepperoniPizza().makePizza();
        System.out.println("Pizza is ready....");

        System.out.println("Making the Hawaii pizza....");
        new HawaiiPizza().makePizza();
        System.out.println("Pizza is ready....");
    }
}
