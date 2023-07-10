package design.pattern.visitor;

import design.pattern.visitor.game.GameA;
import design.pattern.visitor.game.GameB;
import design.pattern.visitor.game.GameVisitor;
import design.pattern.visitor.game.PriceCalculationGameVisitor;


/**
 * Visitor pattern runner.
 * Creates a {@link GameA},a {@link GameB} and a {@link PriceCalculationGameVisitor}.
 * After that, the runner will call both games with the {@link PriceCalculationGameVisitor}, executing both of the
 * price calculation visit() methods.
 */
public class VisitorRunner {

    public static void main(String... args) {

        GameA gameA = new GameA("GameA", "GameA description", "GameA specific property");
        GameB gameB = new GameB("GameB", "GameB description", "GameB specific property");

        GameVisitor<Double> priceCalculationVisitor = new PriceCalculationGameVisitor();

        System.out.println("Price of  gameA: " + gameA.acceptVisitor(priceCalculationVisitor));
        System.out.println("Price of  gameB: " + gameB.acceptVisitor(priceCalculationVisitor));


    }
}
