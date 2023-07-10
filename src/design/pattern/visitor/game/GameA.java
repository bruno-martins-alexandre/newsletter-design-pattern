package design.pattern.visitor.game;

import lombok.Getter;

/**
 * Describes the base properties of the {@link GameA} - a type of {@link Game}.
 */
public final class GameA extends Game {

    @Getter
    private final String gameASpecificProperty;

    public GameA(String name, String description, String gameASpecificProperty) {
        super(name, description);
        this.gameASpecificProperty = gameASpecificProperty;
    }

    public <T> T acceptVisitor(GameVisitor<T> gameVisitor) {
        return gameVisitor.visit(this);
    }

}
