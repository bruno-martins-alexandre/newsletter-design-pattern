package design.pattern.template.pizza;

/**
 * This class knows how to make a Pepperoni pizza
 *
 * @author bruno.alexandre@diconium.com
 */
public final class PepperoniPizza extends PizzaTemplate {
    @Override
    protected void addToppings() {
        System.out.println("Cheese was added");
        System.out.println("Pepperoni was added");
    }

    @Override
    protected void addSauce(){
        //Let's put more sauce on this pizza
        System.out.println("Some tomato sauce was added...");
        System.out.println("Some tomato sauce was added...");
        System.out.println("Some tomato sauce was added...");
    }
}

