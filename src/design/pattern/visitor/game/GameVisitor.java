package design.pattern.visitor.game;

/**
 * This interface defines a visit() method for each of the types of {@link Game}'s.
 * Each implementation of this interface should define a {@link Game} functionality by giving its implementation
 * on each of the visit() methods based on the type of {@link Game} that they receive by input
 *
 * @param <T> return type of the visit() method
 */
public interface GameVisitor<T> {

    T visit(GameA gameA);

    T visit(GameB gameB);
}
