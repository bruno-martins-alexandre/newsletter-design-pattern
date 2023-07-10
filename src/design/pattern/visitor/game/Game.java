package design.pattern.visitor.game;

import lombok.Getter;

/**
 * Describes the base properties of a Game.
 * It also contains a method to receive a {@link GameVisitor} with a Game functionality that will allow
 * this class to be open for extension.
 */
@Getter
public abstract sealed class Game permits GameA, GameB {

    private final String name;
    private final String description;

    protected Game(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * Receives an implementation of a {@link GameVisitor} and runs the visitor() method.
     *
     * @param gameVisitor a {@link GameVisitor} implementation with a Game functionality.
     * @param <T>         return type of the {@link GameVisitor}.
     * @return result of the {@link GameVisitor} visit() method computation.
     */
    public abstract <T> T acceptVisitor(GameVisitor<T> gameVisitor);

}
