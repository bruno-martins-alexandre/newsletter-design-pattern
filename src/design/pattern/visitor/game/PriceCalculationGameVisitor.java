package design.pattern.visitor.game;

/**
 * This class is an implementation of a {@link GameVisitor} and defines the price calculation logic
 * for a {@link Game}
 */
public class PriceCalculationGameVisitor implements GameVisitor<Double> {

    public Double visit(GameA gameA) {
        return 10.0;
    }

    public Double visit(GameB gameB) {
        return 20.0;
    }

}
