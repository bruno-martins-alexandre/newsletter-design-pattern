package design.pattern.template.pizza;

/**
 * This class knows how to make a Hawaii pizza
 *
 * @author bruno.alexandre@diconium.com
 */
public final class HawaiiPizza extends PizzaTemplate {
    @Override
    protected void addToppings() {
        System.out.println("Cheese was added");
        System.out.println("Pineapple was added");
        System.out.println("Ham was added");
    }
}
